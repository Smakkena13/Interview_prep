package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class checkboxes {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();

        List<WebElement> checkboxes= driver.findElements(By.cssSelector("input.form-check-input[type='checkbox']"));
//        for(WebElement ch:checkboxes){
//            if(ch.isSelected()==false){
//                ch.click();
//            }
//        }

        //1st - 3
//        for(int i=0;i<3;i++){
//            checkboxes.get(i).click();
//        }

        //last 3
        int total=checkboxes.size(); //7
        int start=total-3; //7-3=4
        for(int i=start;i<total;i++){
            checkboxes.get(i).click();
        }

        driver.findElement(By.xpath("//input[@id='female']")).click();
    }
}
