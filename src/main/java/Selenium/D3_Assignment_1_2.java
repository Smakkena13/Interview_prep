package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class D3_Assignment_1_2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String reqItem[]={"Cucumber","Beetroot","Cauliflower"};

        List<WebElement> veggies=driver.findElements(By.xpath("//h4[@class='product-name']"));
        System.out.println("total veggies:- "+veggies.size());

        int count=0;
        for(int i=0;i< veggies.size();i++){
            String veg=veggies.get(i).getText();
            String a[]=veg.split("-");
            String vegItem=a[0].trim();

            List wantedItems= Arrays.asList(reqItem);
            if(wantedItems.contains(vegItem)){
                count++;
                List<WebElement> buttons=driver.findElements(By.xpath("//div[@class='product-action']//button"));
                buttons.get(i).click();
            }
            if(count== reqItem.length){
                break;
            }
        }

        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@class='promoBtn']")).click();

        WebElement e=wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='promoInfo']")));
        System.out.println(e.getText());

        driver.findElement(By.xpath("//button[text()='Place Order']")).click();
        driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
        driver.findElement(By.xpath("//button[text()='Proceed']")).click();


    }
}
