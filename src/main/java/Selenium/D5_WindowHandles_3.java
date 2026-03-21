package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class D5_WindowHandles_3 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("india");
        driver.findElement(By.className("wikipedia-search-button")).click();

        List<WebElement> links=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']/a"));
        for(WebElement link:links){
            link.click();
        }

        Set<String> wids=driver.getWindowHandles();
        System.out.println(wids);
        for(String wid:wids){
            String title=driver.switchTo().window(wid).getTitle();
            if(title.equalsIgnoreCase("India - Wikipedia") || title.equalsIgnoreCase("India national cricket team - Wikipedia")){
                driver.close();
            }
        }

    }
}
