package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Date4 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.stepcampus.in/playground");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement e=driver.findElement(By.xpath("//span[text()='Pick a date']"));
        Actions at=new Actions(driver);
        at.scrollToElement(e).perform();

        e.click();
        String year="2027";
        String month="June";
        String date="3";

//        Approch 1
//        driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).sendKeys("09/07/2026");
//        driver.findElement(By.xpath("//div[text()='Slider']")).click();

        while(true){
            String currYM=driver.findElement(By.cssSelector("div#react-day-picker-1")).getText();
            String a[]=currYM.split(" ");
            String mon=a[0];
            String yer=a[1];

            if(mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)){
                break;
            }
            driver.findElement(By.xpath("//button[@name='next-month']")).click();
        }
        List<WebElement> dates= driver.findElements(By.cssSelector("button[name='day']:not([class*='day-outside'])"));
        for(WebElement da:dates){
            if(da.getText().equalsIgnoreCase(date)){
                da.click();
                break;
            }
        }
        driver.findElement(By.xpath("//div[text()='Slider']")).click();
    }
}
