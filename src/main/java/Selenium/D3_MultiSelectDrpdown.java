package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class D3_MultiSelectDrpdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement drp= driver.findElement(By.id("animals"));
        Select sc=new Select(drp);
        sc.selectByVisibleText("Zebra");
        System.out.println(sc.getFirstSelectedOption().getText());
        sc.selectByValue("cat");
        System.out.println(sc.getFirstSelectedOption().getText());
        sc.selectByIndex(1);
        System.out.println(sc.getFirstSelectedOption().getText());

        List<WebElement> options=sc.getOptions();
        System.out.println(options.size());
        for(WebElement op:options){
//            System.out.println(op.getText());
        }

    }
}
