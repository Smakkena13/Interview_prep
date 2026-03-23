package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class D6_Date2 {
    public static void future_Date(WebDriver driver,String exp_year,String exp_month,String exp_date){
        while(true){
            String curr_year=driver.findElement(By.className("ui-datepicker-year")).getText();
            String curr_month=driver.findElement(By.className("ui-datepicker-month")).getText();

            if(curr_year.equals(exp_year) && curr_month.equalsIgnoreCase(exp_month)){
                break;
            }
            else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }
        }

        //date
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
        for(WebElement d:dates){
            if(d.getText().equals(exp_date)){
                d.click();
                break;
            }
        }
    }

    public static void past_Date(WebDriver driver,String exp_year,String exp_month,String exp_date){
        while(true){
            String curr_year=driver.findElement(By.className("ui-datepicker-year")).getText();
            String curr_month=driver.findElement(By.className("ui-datepicker-month")).getText();

            if(curr_year.equals(exp_year) && curr_month.equalsIgnoreCase(exp_month)){
                break;
            }
            else{
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }
        }

        //date
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td//a"));
        for(WebElement d:dates){
            if(d.getText().equals(exp_date)){
                d.click();
                break;
            }
        }
    }
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String exp_year="2027";
        String exp_month="May";
        String exp_date="20";

        driver.findElement(By.id("datepicker")).click();
//        future_Date(driver,exp_year,exp_month,exp_date);
//        future_Date(driver,"2027","June","14");
        past_Date(driver,"2023","March","20");

    }
}
