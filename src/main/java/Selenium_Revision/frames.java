package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class frames {
    public static void main(String[] args) {

        WebDriver driver=new EdgeDriver();
        driver.get("https://www.stepcampus.in/playground");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions at=new Actions(driver);
//        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Outer Frame']")));
        driver.switchTo().frame(0);
        WebElement e= driver.findElement(By.xpath("//h3[text()='Outer Frame']"));
        at.scrollToElement(e).perform();
        System.out.println(e.getText());

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Nested Frame']")));
        WebElement e1=driver.findElement(By.xpath("//h3[text()='Nested Frame']"));
        System.out.println(e1.getText());

        driver.findElement(By.xpath("//button[text()='Click me']")).click();
        driver.switchTo().alert().accept();

        //come one level out
        driver.switchTo().parentFrame();
        System.out.println(e.getText());

        //complete out
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//div[text()='Frames']")).getText());


    }
}
