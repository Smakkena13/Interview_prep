package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class Navigational {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Actions at=new Actions(driver);
        WebElement e= driver.findElement(By.xpath("//a[text()='Blog']"));
        at.keyDown(Keys.CONTROL).click(e).keyUp(Keys.CONTROL).perform();

        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        driver.navigate().to("https://www.pavanonlinetrainings.com/#udemy");
        driver.navigate().back();
        driver.navigate().forward();


    }
}
