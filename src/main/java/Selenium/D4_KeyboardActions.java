package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D4_KeyboardActions {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //new tab
        WebElement e1= driver.findElement(By.xpath("//div[@class='widget-content']//li[4]"));
        Actions at=new Actions(driver);
        at.keyDown(Keys.CONTROL).click(e1).keyUp(Keys.CONTROL).perform();

        //capital letters
        WebElement e2=driver.findElement(By.id("name"));
        at.moveToElement(e2).click().keyDown(Keys.SHIFT).sendKeys("happy").keyUp(Keys.SHIFT).perform();

        //ctrl+A
        at.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        //ctrl+C
        at.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        //tab
        at.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();

        //ctrl+V
        at.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();




//

    }
}
