package Selenium_Revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class newWindow {
    public static void main(String[] args) {
        WebDriver driver=new EdgeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //on parent window
        System.out.println("1st: "+driver.getTitle());
        String pid=driver.getWindowHandle();
        System.out.println("parent id: "+pid);

        driver.switchTo().newWindow(WindowType.TAB);  //WINDOW
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        //on child window
        System.out.println("child: "+driver.getTitle());

        //go back to parent
        driver.switchTo().window(pid);
        System.out.println("2nd: "+driver.getTitle());


    }
}
