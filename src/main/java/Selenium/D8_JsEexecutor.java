package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D8_JsEexecutor {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        //sendkeys
        WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
        js.executeScript("arguments[0].setAttribute('value','rings')",e);

        //click
        WebElement e1=driver.findElement(By.id("nav-search-submit-button"));
        js.executeScript("arguments[0].click()",e1);

        //scroll to a webelement visible
//        WebElement e2=driver.findElement(By.id("p_n_g-101015233022111-title"));
//        js.executeScript("arguments[0].scrollIntoView()",e2);

        //scroll to some point
//        js.executeScript("window.scrollBy(0,300)");

        //scroll to bottom and top of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

        //zoom in and out
        js.executeScript("document.body.style.zoom='50%'");
        Thread.sleep(2000);
        js.executeScript("document.body.style.zoom='120%'");


    }
}
