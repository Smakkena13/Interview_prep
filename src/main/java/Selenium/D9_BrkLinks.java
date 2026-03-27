package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class D9_BrkLinks {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        List<WebElement> links=driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link:links){
            String hrefval=link.getAttribute("href");
            if(hrefval.isEmpty() ||hrefval==null){
                System.out.println("empty url");
            }
            try{
                URL url=new URL(hrefval);
                HttpURLConnection conn=(HttpURLConnection) url.openConnection();
                conn.connect();

                if(conn.getResponseCode()>=400){
                    System.out.println(hrefval+" is a broken link");
                }
            }catch (Exception e){
                System.out.println("meassage: "+e.getMessage());
            }

        }
        driver.quit();

    }
}
