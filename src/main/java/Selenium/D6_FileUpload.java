package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class D6_FileUpload {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Happy\\OneDrive\\Desktop\\Selenium_All\\21Days_Plan.txt");
        driver.findElement(By.xpath("//form[@id='singleFileForm']//button")).click();

        String f1="C:\\Users\\Happy\\OneDrive\\Desktop\\Selenium_All\\Mandatory_skills.txt";
        String f2="C:\\Users\\Happy\\OneDrive\\Desktop\\Selenium_All\\21Days_Plan.txt";
        driver.findElement(By.id("multipleFilesInput")).sendKeys(f1+"\n"+f2);

        driver.findElement(By.xpath("//form[@id='multipleFilesForm']//button")).click();
    }
}
