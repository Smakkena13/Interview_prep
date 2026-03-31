package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class D12_test {
    WebDriver driver;
    @BeforeClass
    void setUp(){
        driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test(dataProvider="dp")
    void login(String email,String pwd){
        JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement e=driver.findElement(By.xpath("//div[@class='well']"));
        js.executeScript("arguments[0].scrollIntoView()",e);

        WebElement em=driver.findElement(By.id("input-email"));
        em.clear();
        em.sendKeys(email);

        WebElement pw=driver.findElement(By.id("input-password"));
        pw.clear();
        pw.sendKeys(pwd);
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        boolean actual=driver.findElement(By.xpath("//h2[text()='My Account']")).isDisplayed();
        Assert.assertEquals(actual,true);

        driver.findElement(By.xpath("(//a[text()='Logout'])[2]")).click();
        driver.findElement(By.xpath("(//a[text()='Login'])[2]")).click();
    }

    @DataProvider(name="dp",indices={0,3})
    Object[][] logindata(){
        Object data[][]={
                {"msk@gmail.com","msk"},
                {"abc@gmail","123"},
                {"aa","ww"},
                {"msk13@gmail.com","admin"},
                {"qwe","12"}
        };
        return data;
    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
