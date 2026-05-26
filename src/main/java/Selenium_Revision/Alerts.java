package Selenium_Revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//button[@id='alertBtn']")).click();
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
        //when you are doing alert functions, but alert is not there- NoAlertPresentException
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
//        a.sendKeys("hey");
        a.accept();

        driver.findElement(By.xpath("//button[@id='promptBtn']")).click();
        String s="hoooooo";
        driver.switchTo().alert().sendKeys(s);
        driver.switchTo().alert().accept();
        if(driver.findElement(By.xpath("//p[@id='demo']")).getText().contains(s)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

//if a alert is opened , u did not handled it-UnhandledAlert Expection
        driver.findElement(By.xpath("//input[@id='female']"));





    }
}
