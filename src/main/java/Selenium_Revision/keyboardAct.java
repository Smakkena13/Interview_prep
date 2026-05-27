package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class keyboardAct {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        Actions at=new Actions(driver);
        WebElement e=driver.findElement(By.id("name"));
        at.moveToElement(e).click().sendKeys("abc").perform();

        //select
        at.moveToElement(e).keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //copy
        at.moveToElement(e).keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //tab
        at.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //paste
        at.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        WebElement e2=driver.findElement(By.id("phone"));
        at.sendKeys(e2,"12345").perform();

        at.keyDown(Keys.SHIFT).sendKeys("lalala").keyUp(Keys.SHIFT).perform();

        WebElement e1= driver.findElement(By.xpath("//button[text()='Point Me']"));
        at.scrollToElement(e1).perform();


    }
}
