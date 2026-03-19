package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D3_Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //simple alert
        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //conformation alert
        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        //prompt alert
        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        Alert a=driver.switchTo().alert();
        Thread.sleep(2000);
        a.sendKeys("happy");
        System.out.println(a.getText());
        a.accept();
    }
}
