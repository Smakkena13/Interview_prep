package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class D5_WindowHandles_2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/windows");
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        WebElement a=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='row']/a")));
        a.click();
        Set<String> wids=driver.getWindowHandles();
        System.out.println(wids);

        //Approch-2
        List<String> ids=new ArrayList<String>(wids);
        String parent=ids.get(0);
        String child=ids.get(1);

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h1")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//div[@class='row']/a")).getText());


    }
}
