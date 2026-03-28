package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class D3_Assignment_1_1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        String itemReq[]={"Cucumber","Tomato","Brinjal"};

        List<WebElement> veggies=driver.findElements(By.xpath("//h4[@class='product-name']"));
        System.out.println("total veggies:- "+veggies.size());

        int count=0;
        for(int i=0;i<veggies.size();i++){
            String veg=veggies.get(i).getText(); //Brocolli - 1 Kg
            String a[]=veg.split("-"); //Brocolli // 1 Kg
            String vegName=a[0].trim(); //Brocolli

            List wantedItems = Arrays.asList(itemReq);

            if(wantedItems.contains(vegName)){
                count++;
                List<WebElement> buttons=driver.findElements(By.xpath("//div[@class='product-action']//button"));
                buttons.get(i).click();
            }

            if(count== itemReq.length){
                break;
            }
        }
    }
}
