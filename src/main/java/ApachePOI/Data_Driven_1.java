package ApachePOI;

import Utility.ExcelUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class Data_Driven_1 {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();

        if(driver.findElement(By.id("wzrk-cancel")).isDisplayed()){
            driver.findElement(By.id("wzrk-cancel")).click();
        }

        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement e=driver.findElement(By.className("PT25"));
        js.executeScript("arguments[0].scrollIntoView()",e);

        String file= System.getProperty("user.dir")+"\\testdata\\sbical.xlsx";
        int rows= ExcelUtils.getRowCount(file,"Sheet1");
        for(int r=1;r<=rows;r++){
            String principle=ExcelUtils.getCellData(file,"Sheet1",r,0);
            String roi=ExcelUtils.getCellData(file,"Sheet1",r,1);
            String p1=ExcelUtils.getCellData(file,"Sheet1",r,2);
            String p2=ExcelUtils.getCellData(file,"Sheet1",r,3);
            String freq=ExcelUtils.getCellData(file,"Sheet1",r,4);
            String maturityval=ExcelUtils.getCellData(file,"Sheet1",r,5);

            //pass into application
            driver.findElement(By.id("principal")).sendKeys(principle);
            driver.findElement(By.id("interest")).sendKeys(roi);
            driver.findElement(By.id("tenure")).sendKeys(p1);

            WebElement dp1= driver.findElement(By.id("tenurePeriod"));
            Select sc1=new Select(dp1);
            sc1.selectByVisibleText(p2);

            WebElement dp2= driver.findElement(By.id("frequency"));
            Select sc2=new Select(dp2);
            sc2.selectByVisibleText(freq);

            driver.findElement(By.xpath("//a[@onclick='return getfdMatVal(this);']")).click();
            String actual=driver.findElement(By.xpath("//span[@id='resp_matval']/strong")).getText();

            //validation
            if(Double.parseDouble(actual)==Double.parseDouble(maturityval)) {
                System.out.println("test passed");
                ExcelUtils.setCellData(file, "Sheet1", r, 7, "passed");
                ExcelUtils.fillGreenColor(file, "Sheet1", r, 7);
            }else{
                System.out.println("test failed");
                ExcelUtils.setCellData(file, "Sheet1", r, 7, "failed");
                ExcelUtils.fillRedColor(file, "Sheet1", r, 7);
            }
            driver.findElement(By.xpath("//a[@onclick='javascript:reset_fdcalcfrm();']")).click();
        }
        driver.close();
    }
}
