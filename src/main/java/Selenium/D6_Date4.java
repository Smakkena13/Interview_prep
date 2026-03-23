package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D6_Date4 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String exp_month_year="June 2027";
        String date="2";

        driver.findElement(By.cssSelector("svg.react-date-picker__calendar-button__icon.react-date-picker__button__icon")).click();
        while(true){
            String curr_month_year=driver.findElement(By.xpath("//button[@class='react-calendar__navigation__label']//span")).getText();
            System.out.println(curr_month_year);

            if(curr_month_year.equalsIgnoreCase(exp_month_year)){
                break;
            }
            else{
                driver.findElement(By.xpath("//button[@class='react-calendar__navigation__arrow react-calendar__navigation__next-button']")).click();
            }
        }
        //date
        driver.findElement(By.xpath("//abbr[text()="+date+"]")).click();
    }
}
