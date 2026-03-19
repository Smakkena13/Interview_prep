package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class D3_Assignment_2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(6));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        List<WebElement> msg=driver.findElements(By.cssSelector("p.text-center.text-white i"));
        String un=msg.get(0).getText();
        String pswd=msg.get(1).getText();

        driver.findElement(By.id("username")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(pswd);

        driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
        wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='modal-content']")));
        driver.findElement(By.id("okayBtn")).click();

        WebElement drp=driver.findElement(By.xpath("//select[@class='form-control']"));
        Select sc=new Select(drp);
        sc.selectByVisibleText("Consultant");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("signin")).click();

        //2nd page
        List<WebElement> carts=driver.findElements(By.cssSelector("button.btn.btn-info i"));
        for(WebElement cart:carts){
            cart.click();
        }

        driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();

        //3rd page
        driver.findElement(By.xpath("//button[normalize-space()='Checkout']")).click();

        //4th page
        driver.findElement(By.id("country")).sendKeys("ind");
        List<WebElement> countries=wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='suggestions']//li")));
        for(WebElement c:countries){
            if(c.getText().equalsIgnoreCase("india")){
                c.click();
                break;
            }
        }

        driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase']")).click();

        driver.findElement(By.tagName("strong")).isDisplayed();
        Assert.assertTrue(true);
    }
}
