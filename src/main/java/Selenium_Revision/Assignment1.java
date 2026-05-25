package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Assignment1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
        List<WebElement> drps=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for(WebElement drp:drps){
            if(drp.getText().equalsIgnoreCase("india")){
                drp.click();
            }
        }

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.xpath("//a[@value='MAA']")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='HYD']")).click();
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        driver.findElement(By.cssSelector("div#divpaxinfo.paxinfo")).click();

        //add 3more adults
        for(int i=1;i<=3;i++){
            driver.findElement(By.cssSelector("span#hrefIncAdt")).click();
        }
        driver.findElement(By.cssSelector("input#btnclosepaxoption")).click();

        WebElement drs=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select sc=new Select(drs);
        sc.selectByVisibleText("USD");

        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
    }
}
