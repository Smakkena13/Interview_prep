package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class D7_Tables2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //total cols
        List<WebElement> cols=driver.findElements(By.xpath("//table[@id='taskTable']//th"));
        int col=cols.size();

        //total rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr"));
        int row=rows.size();

        //print particular data
        System.out.println("===================");
        System.out.println(driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr[1]//td[3]")).getText());
        System.out.println(driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr[3]//td[4]")).getText());
        System.out.println("===================");

        //print all
        for(int r=1;r<row;r++){
            for(int c=1;c<=col;c++){
                System.out.print(driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+r+"]//td["+c+"]")).getText()+"\t");
            }
            System.out.println();
        }

        System.out.println("===================");

//        print CPU% of chrome and validate with below
        String result=driver.findElement(By.xpath("//div[@id='displayValues']//strong")).getText();
        for(int r=1;r<row;r++){
            for(int c=1;c<=col;c++){
                String name=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+r+"]//td["+c+"]")).getText();
                if(name.equalsIgnoreCase("chrome")){
                    String val1=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+r+"]//td[2]")).getText();
                    String val2=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+r+"]//td[3]")).getText();
                    String val3=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+r+"]//td[4]")).getText();
                    String val4=driver.findElement(By.xpath("//table[@id='taskTable']//tbody//tr["+r+"]//td[5]")).getText();
                    System.out.println(val1+" "+val2+" "+val3+" "+val4);

                    if(val1.contains(result) || val2.contains(result) || val3.contains(result) || val4.contains(result)){
                        System.out.println("TC is passed");
                    }
                    else{
                        System.out.println("TC is failed");
                    }
                    break;
                }
            }

        }

        System.out.println("===================");


    }
}
