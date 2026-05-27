package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

public class Assignment2 {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(9));

        String un= driver.findElement(By.xpath("(//b/i)[1]")).getText();
        String pwd= driver.findElement(By.xpath("(//b/i)[2]")).getText();

        driver.findElement(By.id("username")).sendKeys(un);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='user']")).click();

        WebElement e= wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='okayBtn']")));
        e.click();
        WebElement drp=driver.findElement(By.xpath("//select[@class='form-control']"));
        Select sc=new Select(drp);
        sc.selectByVisibleText("Consultant");

        driver.findElement(By.xpath("//input[@id='terms']"));
        driver.findElement(By.xpath("//input[@id='signInBtn']")).click();

        //2nd page
        List<WebElement> carts=driver.findElements(By.cssSelector("button.btn.btn-info"));
        for(WebElement cart:carts){
            cart.click();
        }
        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();

        //3rd page
        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();

        //4th page
        driver.findElement(By.xpath("//input[@id='country']")).sendKeys("ind");
        List<WebElement> options= wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@class='suggestions']//a")));
        for(WebElement op:options){
            if(op.getText().equalsIgnoreCase("india")){
                op.click();
                break;
            }
        }
        driver.findElement(By.xpath("//label[@for='checkbox2']")).click();
        driver.findElement(By.xpath("//input[@value='Purchase']")).click();

        //fluet wait syntax
        Wait<WebDriver> w=new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

    }
}
