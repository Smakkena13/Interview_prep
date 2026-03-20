package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D1_locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        System.out.println("these are locators");

        //id
        driver.findElement(By.id("name")).sendKeys("msk");

        //partial link text
        driver.findElement(By.partialLinkText("Udemy")).click();

        driver.navigate().back();

        //tagname
        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //className
        driver.findElement(By.className("region-inner")).isDisplayed();

        //cssSelector
        driver.findElement(By.cssSelector("input#email")).sendKeys("abc@gmail.com");
        driver.findElement(By.cssSelector("input.form-control[id=phone]")).sendKeys("123456");

        //pseudo-selectors
        driver.findElement(By.cssSelector("div.form-group > input:first-of-type")).clear();
        driver.findElement(By.cssSelector("div.form-group > input:nth-of-type(2)")).clear();

        driver.findElement(By.cssSelector("select#colors >:first-child")).click();
        System.out.println(driver.findElement(By.cssSelector("select#colors >:nth-last-child(2)")).getText());


    }

}
