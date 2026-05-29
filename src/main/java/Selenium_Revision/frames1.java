package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class frames1 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.switchTo().frame("mce_0_ifr");
        WebElement e=driver.findElement(By.xpath("//body[@id='tinymce']/p"));
        System.out.println(e.getText());
    }
}
