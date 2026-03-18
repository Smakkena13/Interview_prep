package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class D2_checkboxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //select all checkboxes
        List<WebElement> chks= driver.findElements(By.cssSelector("input.form-check-input[type='checkbox']"));
//        for(int i=0;i<chks.size();i++){
//            System.out.println("clicked");
//            chks.get(i).click();
//        }

        //last 3
        int total=chks.size();
        int start=total-3;
        for(int i=start;i<total;i++){
            chks.get(i).click();
        }

        //first 3
        for(int i=0;i<3;i++){
            chks.get(i).click();
        }


    }
}
