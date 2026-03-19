package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class D3_SDrpdown {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement drp= driver.findElement(By.cssSelector("p select"));
        Select sc=new Select(drp);
        sc.selectByVisibleText("Andorra");
        System.out.println(sc.getFirstSelectedOption().getText());
        sc.selectByValue("ABW");
        System.out.println(sc.getFirstSelectedOption().getText());
        sc.selectByIndex(1);
        System.out.println(sc.getFirstSelectedOption().getText());

        List<WebElement> options=sc.getOptions();
        System.out.println(options.size());
        for(WebElement op:options){
//            System.out.println(op.getText());
        }

    }
}
