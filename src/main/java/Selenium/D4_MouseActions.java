package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D4_MouseActions {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(6));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //mouse-hover
        Actions at=new Actions(driver);
        WebElement w1=driver.findElement(By.xpath("//button[text()='Point Me']"));
        WebElement w2= driver.findElement(By.xpath("//a[text()='Laptops']"));
        at.moveToElement(w1).moveToElement(w2).build().perform();

        //double-click
        WebElement w3= driver.findElement(By.id("field1"));
        w3.clear();
        w3.sendKeys("happy");
        at.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).perform();
        WebElement w4= driver.findElement(By.id("field2"));
        String a1=w3.getAttribute("value");
        String a2=w4.getAttribute("value");
        if(a1.equalsIgnoreCase(a2)){
            System.out.println("both are equal!");
        }

        //drag-and-drop
        WebElement src= driver.findElement(By.id("draggable"));
        WebElement target= driver.findElement(By.id("droppable"));
        at.dragAndDrop(src,target).perform();

        //slider
        WebElement b1= driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[1]"));
        System.out.println(b1.getLocation());
        at.dragAndDropBy(b1,60,0).perform();
        //at.dragAndDropBy(b1,-60,0).perform();
        System.out.println(b1.getLocation());

//        right-click
        at.contextClick(w1).perform();
    }
}
