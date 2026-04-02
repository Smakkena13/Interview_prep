package ApachePOI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Data_Driven_2 {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.cit.com/cit-bank/resources/calculators/certificate-of-deposit-calculator");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        if(driver.findElement(By.id("onetrust-reject-all-handler")).isDisplayed()){
            driver.findElement(By.id("onetrust-reject-all-handler")).click();
        }

        WebElement e=driver.findElement(By.xpath("(//div[@class='mdc-layout-grid'])[2]"));
        JavascriptExecutor js=(JavascriptExecutor)driver ;
        js.executeScript("arguments[0].scrollIntoView()",e);

        String file=System.getProperty("user.dir")+"\\testData\\citibank.xlsx";
        int rows=ExcelUtils.getRowCount(file,"Sheet1");

        for(int r=1;r<=rows;r++){
            String indepam=ExcelUtils.getCellData(file,"Sheet1",r,0);
            String length=ExcelUtils.getCellData(file,"Sheet1",r,1);
            String intrestrate=ExcelUtils.getCellData(file,"Sheet1",r,2);
            String compounding=ExcelUtils.getCellData(file,"Sheet1",r,3);
            String total=ExcelUtils.getCellData(file,"Sheet1",r,4);

            //pass data into ui
            driver.findElement(By.xpath("//input[@id='mat-input-0']")).clear();
            driver.findElement(By.xpath("//input[@id='mat-input-0']")).sendKeys(indepam);
            driver.findElement(By.xpath("//input[@id='mat-input-1']")).clear();
            driver.findElement(By.xpath("//input[@id='mat-input-1']")).sendKeys(length);
            driver.findElement(By.xpath("//input[@id='mat-input-2']")).clear();
            driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys(intrestrate);
            Thread.sleep(2000);
            driver.findElement(By.xpath("(//div[@class='mat-mdc-form-field-infix'])[4]")).click();
            List<WebElement> op= driver.findElements(By.xpath("//div[@id='mat-select-0-panel']//span"));
            for(WebElement o:op){
                if(o.getText().equalsIgnoreCase(compounding)){
                    o.click();
                    break;
                }
            }
            driver.findElement(By.xpath("//button[@id='CIT-chart-submit']")).click();
            String actual=driver.findElement(By.xpath("//span[@id='displayTotalValue']")).getText();

            if(actual.equalsIgnoreCase(total)){
                System.out.println("test passed");
                ExcelUtils.setCellData(file,"Sheet1",r,6,"passed");
                ExcelUtils.fillGreenColor(file,"Sheet1",r,6);
            }else {
                System.out.println("test failed");
                ExcelUtils.setCellData(file, "Sheet1", r, 6, "failed");
                ExcelUtils.fillRedColor(file, "Sheet1", r, 6);

            }}
    }
}
