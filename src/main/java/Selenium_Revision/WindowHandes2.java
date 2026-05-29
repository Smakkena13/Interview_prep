package Selenium_Revision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandes2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.stepcampus.in/playground");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        WebElement e=driver.findElement(By.xpath("//div[text()='Window/Tab']"));
        Actions at=new Actions(driver);
        at.scrollToElement(e).perform();

        System.out.println(driver.getWindowHandle());
        driver.findElement(By.xpath("//a[text()='Open Selenium Docs in New Tab']")).click();
        Set<String> ids=driver.getWindowHandles();
        System.out.println(ids);

        //approch 1
        Iterator<String> i=ids.iterator();
        String parent=i.next();
        String child=i.next();

//        driver.switchTo().window(child);
//        System.out.println(driver.getTitle());

        //approch 2
        List<String> li=new ArrayList<String>(ids);
        String p=li.get(0);
        String c=li.get(1);

        driver.switchTo().window(c);
        System.out.println(driver.getTitle());
        driver.switchTo().window(p);
        System.out.println(driver.getTitle());
    }
}
