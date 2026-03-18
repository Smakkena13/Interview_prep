package core_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class D2_locators {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        System.out.println(driver.findElement(By.xpath("//p[contains(@class,'description')]/span")).getText());
        System.out.println(driver.findElement(By.xpath("//h1[starts-with(@class,'tit')]")).getText());
        System.out.println(driver.findElement(By.xpath("//h3[normalize-space()='GUI Elements']")).getText());

        //xpath axes
        driver.findElement(By.xpath("//input[@id='name']/parent::div")).isDisplayed();
        driver.findElement(By.xpath("//input[@id='name']/following-sibling::input[last()]"));
        driver.findElement(By.xpath("//div[@id='post-body-1307673142697428135']/ancestor::div[1]"));



    }
}
