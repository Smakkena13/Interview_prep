package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("name")).sendKeys("msk");
        System.out.println(driver.findElement(By.linkText("Udemy Courses")).getText());
        System.out.println(driver.findElement(By.partialLinkText("Playwri")).getText());
        System.out.println(driver.findElements(By.className("form-group one")).size());
        List<WebElement> links= driver.findElements(By.tagName("a"));
        System.out.println(links.size());

    }
}
