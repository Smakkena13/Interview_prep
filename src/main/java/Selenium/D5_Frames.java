package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D5_Frames {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.stepcampus.in/playground");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

//        driver.switchTo().frame(0);
//        driver.switchTo().frame("name/id");
//        driver.switchTo().parentFrame();
//        driver.switchTo().defaultContent();

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer Frame']")));
        System.out.println(driver.findElement(By.xpath("//h3[text()='Outer Frame']")).getText());

        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//button[text()='Click me']")).click();
        driver.switchTo().alert().accept();

        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.xpath("//h3[text()='Outer Frame']")).getText());

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//button[text()='Password']")).click();


    }
}
