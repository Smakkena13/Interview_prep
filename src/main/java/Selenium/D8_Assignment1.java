package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class D8_Assignment1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://blazedemo.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement e1=driver.findElement(By.name("fromPort"));
        Select s1=new Select(e1);
        s1.selectByVisibleText("Portland");

        WebElement e2=driver.findElement(By.name("toPort"));
        Select s2=new Select(e2);
        s2.selectByVisibleText("New York");

        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();

        //total rows
        List<WebElement> row=driver.findElements(By.xpath("//table[@class='table']//tr"));
        int rows= row.size();
        System.out.println("Total rows: "+rows);

        List<String> pr=new ArrayList<String>();
        for(int r=1;r<rows;r++){
            String price=driver.findElement(By.xpath("//table[@class='table']//tr["+r+"]//td[6]")).getText();
            pr.add(price);
        }
        System.out.println("Prices: "+pr);
        Collections.sort(pr); //ascending
//        Collections.sort(pr,Collections.reverseOrder()); //descending
        System.out.println("Prices after sort: "+pr);
        String lessPrice=pr.get(0);

        for(int r=1;r<rows;r++) {
            String price = driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[6]")).getText();
            if (price.equalsIgnoreCase(lessPrice)) {
                driver.findElement(By.xpath("//table[@class='table']//tr[" + r + "]//td[1]//input")).click();
                break;
            }
        }

    }
}
