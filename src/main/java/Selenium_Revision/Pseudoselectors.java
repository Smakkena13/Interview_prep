package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Pseudoselectors {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

        System.out.println(driver.findElement(By.cssSelector("div.form-group>input:first-of-type")).getText());
        System.out.println(driver.findElement(By.cssSelector("div.form-group>label:nth-of-type(2)")).getText());
        System.out.println(driver.findElement(By.cssSelector("div.form-group:nth-of-type(1) >label:last-of-type")).getText());
//        select#colors >:first-child , select#colors >:last-child, select#colors >:nth-child(4) , select#colors >:nth-last-child(2)

    }
}
