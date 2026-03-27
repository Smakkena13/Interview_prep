package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class D9_BrokenLinks {
    public static void main(String[] args) throws IOException {
//
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for(WebElement link:links){
            String hrefattribute=link.getAttribute("href");
            if(hrefattribute.isEmpty() || hrefattribute==""){
                System.out.println("empty url");
            }

            URL url=new URL(hrefattribute);
            HttpURLConnection conn= (HttpURLConnection) url.openConnection();
            conn.connect();

            if(conn.getResponseCode()>=400){
                System.out.println(hrefattribute+" is a broken link");
            }else{
                System.out.println(hrefattribute+" is a valid link");
            }
        }
    }
}
