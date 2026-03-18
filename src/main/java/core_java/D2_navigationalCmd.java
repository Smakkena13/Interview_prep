package core_java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class D2_navigationalCmd {
    public static void main(String[] args) throws MalformedURLException {
        WebDriver driver=new ChromeDriver();

        URL utl=new URL("https://testautomationpractice.blogspot.com/");
//        driver.navigate().to("https://testautomationpractice.blogspot.com/");
        driver.navigate().to(utl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
//        driver.navigate().notify(); Object class - thead sycornization-nothing to do with browser methods

    }

}
