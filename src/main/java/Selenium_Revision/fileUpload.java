package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class fileUpload {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("singleFileInput")).sendKeys("C:\\Users\\Happy\\OneDrive\\Desktop\\Selenium_All\\Imp_materials\\Courseware.txt");
        driver.findElement(By.xpath("//button[text()='Upload Single File']")).click();

        String f1="C:\\Users\\Happy\\OneDrive\\Desktop\\Selenium_All\\Imp_materials\\Courseware.txt";
        String f2="C:\\Users\\Happy\\OneDrive\\Desktop\\Selenium_All\\Imp_materials\\Useful Links.docx";

        driver.findElement(By.id("multipleFilesInput")).sendKeys(f1+"\n"+f2);
        driver.findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();

    }
}
