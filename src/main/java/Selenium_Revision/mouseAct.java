package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class mouseAct {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement e1= driver.findElement(By.xpath("//button[text()='Point Me']"));
        WebElement e2= driver.findElement(By.xpath("//div[@class='dropdown-content']//a[2]"));

        //mouse hover
        Actions at=new Actions(driver);
        at.moveToElement(e1).moveToElement(e2).click().perform();

        //double click
        at.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).perform();
        String f1=driver.findElement(By.xpath("//input[@id='field1']")).getAttribute("value");
        System.out.println("f1: "+f1);
        String f2=driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
        System.out.println("f2: "+f2);

        if(f1.equalsIgnoreCase(f2)){
            System.out.println("both equal");
        }else{
            System.out.println("not equal");
        }

        //draganddrop
        WebElement src=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement(By.id("droppable"));
        at.dragAndDrop(src,target).perform();

        //horizontal slider
        WebElement min=driver.findElement(By.cssSelector("div#slider-range>span:nth-of-type(1)"));
        System.out.println(min.getLocation());
        System.out.println(min.getLocation().getX());

        at.dragAndDropBy(min,-30,0).perform();
        System.out.println(min.getLocation());
        System.out.println(min.getLocation().getX());


    }
}
