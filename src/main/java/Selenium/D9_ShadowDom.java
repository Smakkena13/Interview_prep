package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D9_ShadowDom {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement e= driver.findElement(By.xpath("//td[@class='columns-cell']"));
        js.executeScript("arguments[0].scrollIntoView()",e);

        SearchContext shadow= driver.findElement(By.cssSelector("div#shadow_host")).getShadowRoot();
        String s=shadow.findElement(By.cssSelector("span#shadow_content")).getText();
        System.out.println(s);

        SearchContext shadow1=driver.findElement(By.cssSelector("div#shadow_host")).getShadowRoot();
        SearchContext shadow2=shadow1.findElement(By.cssSelector("div#nested_shadow_host")).getShadowRoot();
        String res=shadow2.findElement(By.cssSelector("div#nested_shadow_content")).getText();
        System.out.println(res);

    }
}
