package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Getattribute {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().deleteAllCookies();

        WebElement e1=driver.findElement(By.xpath("//div[@id='Div1']"));
        String val1=e1.getAttribute("style");
        System.out.println(val1);

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();

        String val2=e1.getAttribute("style");
        System.out.println(val2);
    }
}
