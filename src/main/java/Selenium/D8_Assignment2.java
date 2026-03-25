package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D8_Assignment2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//span[text()='Admin']")).click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement e= driver.findElement(By.cssSelector("div.orangehrm-horizontal-padding.orangehrm-vertical-padding"));
        js.executeScript("arguments[0].scrollIntoView()",e);

        List<WebElement> row=driver.findElements(By.xpath("//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border']"));
        int rows= row.size();
        System.out.println("Total rows: "+rows);

        for(int r=1;r<=rows;r++){
            String name=driver.findElement(By.xpath("(//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border'])["+r+"]//div[2]")).getText();
            String status=driver.findElement(By.xpath("(//div[@class='oxd-table-body']//div[@class='oxd-table-row oxd-table-row--with-border'])["+r+"]//div[5]")).getText();

            System.out.println(name+" - "+status);
        }
    }
}
