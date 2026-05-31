package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Date2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//input[@id='txtDate']")).click();
        WebElement s1= driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select sc1=new Select(s1);
        sc1.selectByValue("2019");

        WebElement s2= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sc2=new Select(s2);
        sc2.selectByValue("3");

        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
        for(WebElement date:dates){
            if(date.getText().equalsIgnoreCase("12")){
                date.click();
                break;
            }

        }
    }
}
