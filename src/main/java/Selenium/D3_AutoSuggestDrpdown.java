package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class D3_AutoSuggestDrpdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        List<WebElement> options=driver.findElements(By.xpath("//ul[@id='ui-id-1']//a"));
        for(WebElement op:options){
            if(op.getText().equalsIgnoreCase("india")){
                op.click();
                break;
            }
        }
//        getattribute - will get the value of the attribute
        String a=driver.findElement(By.id("autosuggest")).getAttribute("placeholder");
        System.out.println(a);

    }
}
