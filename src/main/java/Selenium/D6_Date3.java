package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D6_Date3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//div[@class='date-picker-box']//input[1]")).sendKeys("04/13/2024");
        driver.findElement(By.xpath("//div[@class='date-picker-box']//input[2]")).sendKeys("06/20/2024");
        driver.findElement(By.xpath("//div[@class='date-picker-box']//button")).click();
    }
}
