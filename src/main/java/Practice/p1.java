package Practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class p1 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor) driver;

        System.out.println(driver.getTitle());
        driver.findElement(By.id("name")).sendKeys("apc");


        WebElement drp=driver.findElement(By.id("country"));
        Select sc=new Select(drp);
        List<WebElement> o= sc.getOptions();
        for(WebElement p:o){
            System.out.println(p.getText());
        }
        sc.selectByVisibleText("Japan");
        System.out.println(sc.getFirstSelectedOption().getText());
        sc.selectByIndex(0);
        System.out.println(sc.getFirstSelectedOption().getText());

        WebElement drp1= driver.findElement(By.id("colors"));
        Select sc1=new Select(drp1);
        js.executeScript("arguments[0].scrollTop += 200;", drp1);
        sc1.selectByValue("blue");
        sc1.selectByIndex(5);

        //checkboxws
        List<WebElement> chcks= driver.findElements(By.xpath("//div[@class='form-check form-check-inline'] //input[@type='checkbox']"));
        System.out.println("no of checkbox: "+chcks.size());
        //click all
//        for(WebElement cb:chcks){
//            cb.click();
//        }

        //1st 3
//        for(int i=0;i<3;i++){
//            chcks.get(i).click();
//        }

        //last 3
        int first=chcks.size()-3;
        for(int i=first;i<chcks.size();i++){
            chcks.get(i).click();
        }


        /*
        WebElement e=driver.findElement(By.linkText("Udemy Courses"));
        Actions at=new Actions(driver);
        at.keyDown(Keys.CONTROL).click(e).keyUp(Keys.CONTROL).perform();

        //autosuggestive drp down
        driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("selenium");
        driver.findElement(By.className("wikipedia-search-button")).click();

        List<WebElement> options=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div//a"));
        for(WebElement op:options){
            if(op.getText().equalsIgnoreCase("Selenium dioxide")){
                op.click();
            }
        }*/

    }
}
