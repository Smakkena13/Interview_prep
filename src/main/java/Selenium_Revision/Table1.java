package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Table1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int row=rows.size();

        List<WebElement> cols=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        int col=cols.size();

        List<WebElement> header=driver.findElements(By.xpath("//table[@name='BookTable']//tr//th"));
        for(WebElement h:header){
            System.out.print(" "+h.getText()+" ");
        }

        //print all data from table
        for(int i=2;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText()+" ");
            }
            System.out.println();
        }

        //print books written by mukesh
        for(int i=2;i<=row;i++){
            String author= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
            if(author.equalsIgnoreCase("mukesh")){
                String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
                System.out.println(book);
            }
        }

        //count total prices of all books
        int total=0;
        for(int i=2;i<=row;i++){
            String price= driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
            total=total+Integer.parseInt(price);
        }
        System.out.println("total: "+total);
    }
}
