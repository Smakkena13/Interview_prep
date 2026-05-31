package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Date1 {
    public static void pastDate(WebDriver driver,String year,String month){
        while(true){
            String currYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String currMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if(currMonth.equalsIgnoreCase(month) && currYear.equalsIgnoreCase(year)){
                break;
            }
            driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-w")).click();
        }

    }
    public static void selectDate(WebDriver driver,String date){
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
        for(WebElement da:dates){
            if(da.getText().equalsIgnoreCase(date)){
                da.click();
                break;
            }
        }
    }
    public static void futureDate(WebDriver driver,String year,String month){
        while(true){
            String currYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            String currMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();

            if(currMonth.equalsIgnoreCase(month) && currYear.equalsIgnoreCase(year)){
                break;
            }
            driver.findElement(By.cssSelector("span.ui-icon.ui-icon-circle-triangle-e")).click();
        }
    }
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String year="2027";
        String month="June";
        String date="30";

        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
//        futureDate(driver,year,month,date);

        pastDate(driver,"2024","April");
        selectDate(driver,"12");

    }
}
