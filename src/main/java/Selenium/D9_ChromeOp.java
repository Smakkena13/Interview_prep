package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.Proxy;

import java.io.File;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class D9_ChromeOp {
    public static void main(String[] args) {
        ChromeOptions co=new ChromeOptions();

        co.addArguments("--headless=new");
        co.addArguments("--incognito");
        co.setAcceptInsecureCerts(true);
        Proxy prox=new Proxy();
        co.setCapability("proxy",prox);
        File f=new File("C:\\Users\\msk\\Downloads\\chromedriver_win32 (1)\\chromedriver.crx");
        co.addExtensions(f);
        co.setExperimentalOption("excludeSwiches", Arrays.asList("disable-popup-blockinng"));

        WebDriver driver=new ChromeDriver(co);
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


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
    }
}
