package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class D8_TakesScreenshot {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //full page
        TakesScreenshot ts= (TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target=new File(System.getProperty("user.dir")+"\\screenshots\\two.png");
        source.renameTo(target);

        //specific webelement
        WebElement e=driver.findElement(By.xpath("//H2[text()='Drag and Drop']"));
        File src1=e.getScreenshotAs(OutputType.FILE);
        File target1=new File(System.getProperty("user.dir")+"\\screenshots\\one.png");
        src1.renameTo(target1);

        driver.quit();


    }
}
