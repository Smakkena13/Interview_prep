package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Date3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("start-date")).sendKeys("07/12/2024");
        driver.findElement(By.id("end-date")).sendKeys("2/9/2025");
        driver.findElement(By.cssSelector("div.date-picker-box >button:last-of-type")).click();

    }
}
