package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class D6_Date1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.stepcampus.in/playground");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//span[text()='Pick a date']")).click();

        //approch-1
//        driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).sendKeys("12/06/2024");
//        driver.findElement(By.xpath("//p[text()='Drop Here']")).click();

        //approch-2
        String exp_month_year="June 2027";
        String a[]=exp_month_year.split(" ");
        String month=a[0];
        String year=a[1];
        String date="14";
        while(true){
            String curr_month_year=driver.findElement(By.xpath("//div[@id='react-day-picker-1']")).getText();
            if(curr_month_year.equalsIgnoreCase(exp_month_year)){
                break;
            }
            else{
                driver.findElement(By.xpath("//button[@name='next-month']")).click();
            }
        }

        //select date
        List<WebElement> dates=driver.findElements(By.xpath("//table[@class='w-full border-collapse space-y-1']//td//button"));
        for(WebElement d:dates){
            if(d.getText().equals(date)){
                d.click();
                break;
            }
        }
        driver.findElement(By.xpath("//p[text()='Drop Here']")).click();
        String res=driver.findElement(By.xpath("//button[normalize-space()='"+month+" "+date+"th, "+year+"']")).getText();
        if(res.contains(month) && res.contains(date) && res.contains(year)){
            System.out.println("TC is passed");
        }
        else{
            System.out.println("TC is failed");
        }
    }

}
