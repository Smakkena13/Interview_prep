package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class D5_WindowHandles_1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://practice.expandtesting.com/windows");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String id = driver.getWindowHandle();
        System.out.println(id);

        driver.findElement(By.xpath("//div[@class='row']/a")).click();
        Set<String> wids=driver.getWindowHandles();
        System.out.println(wids);

        //Approch 1- iterator()
        Iterator<String> i=wids.iterator();
        String parent=i.next();
        String child=i.next();

        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//div[@class='example']/h1")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//div[@class='row']/a")).getText());


    }
}
