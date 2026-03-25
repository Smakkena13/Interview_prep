package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class D7_Tables1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        WebDriverWait wt=new WebDriverWait(driver, Duration.ofSeconds(6));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        //total cols
        List<WebElement> cols=driver.findElements(By.xpath("//table[@name='BookTable']//th"));
        int col=cols.size();

        //total rows
        List<WebElement> rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int row=rows.size();

        //print particular data
        System.out.println(driver.findElement(By.xpath("//table[@name='BookTable']//tr[2]//td[3]")).getText());

        //print all data from table
        System.out.println("===================");
        for(int r=2;r<=row;r++){
            for(int c=1;c<=col;c++){
                System.out.print(driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText()+"\t");
            }
            System.out.println();
        }
        System.out.println("===================");

        //print books whose author is mukesh
        for(int r=2;r<=row;r++){
            String Author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
            if(Author.equalsIgnoreCase("mukesh")){
                String book=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(book);
            }
        }
        System.out.println("===================");

        //sum of all books
        int sum=0;
        for(int r=2;r<row;r++){
            String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
            sum=sum+Integer.parseInt(price);
        }
        System.out.println("total price of all books: "+sum);
        System.out.println("===================");
    }
}
