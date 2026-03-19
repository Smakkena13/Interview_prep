package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class D3_Waits {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(6));

        //implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement e=wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='alertBtn']")));
        e.click();
        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        WebElement e1=wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='confirmBtn']")));
        e1.click();
        Alert a=wt.until(ExpectedConditions.alertIsPresent());
        a.dismiss();

        List<WebElement> chks=wt.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.form-check-input[type='checkbox']")));
        for(int i=0;i<chks.size();i++){
            System.out.println("clicked");
            chks.get(i).click();
        }

        //fluent wait
        Wait<WebDriver> w= new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(3))
                .ignoring(NoSuchElementException.class);

        WebElement foo = w.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.id("textarea"));
            }
        });
        System.out.println(foo.isDisplayed());
    }
}
