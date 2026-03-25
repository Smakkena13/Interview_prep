package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class D7_Tables3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //count total pages
        List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li"));
        int page= pages.size();

        //count rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr"));
        int row=rows.size();

        for(int p=1;p<=page;p++){
                if(p>1){
                    driver.findElement(By.xpath("//ul[@id='pagination']//li["+p+"]//a")).click();
                }
            for(int r=1;r<=row;r++){
                driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+r+"]//td[4]//input")).click();
            }
            Thread.sleep(2000);
        }
    }
}
