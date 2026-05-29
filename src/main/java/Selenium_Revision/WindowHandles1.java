package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class WindowHandles1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        Actions at=new Actions(driver);
        WebElement e=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
        at.sendKeys(e,"ind").perform();

        driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
        List<WebElement> links=driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link' or @id='Wikipedia1_wikipedia-search-more']/a"));
        for(WebElement link:links){
            link.click();
        }

        Set<String> ids= driver.getWindowHandles();
        for(String id:ids){
            String title=driver.switchTo().window(id).getTitle();
            if(title.contains("Indonesia") || title.contains("Indian Premier League")){
                driver.close();
            }
        }
    }
}
