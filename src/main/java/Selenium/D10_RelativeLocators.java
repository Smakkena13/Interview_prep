package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class D10_RelativeLocators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement namef= driver.findElement(By.id("name"));

        WebElement na=driver.findElement(with(By.tagName("label")).above(namef));
        System.out.println(na.getText());

        WebElement email=driver.findElement(with(By.tagName("label")).below(namef));
        System.out.println(email.getText());
    }
}
