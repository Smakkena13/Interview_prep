package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC01_login {

    WebDriver driver;

    @BeforeClass
    void setup(){
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test
    void testLogin(){
        Login_withoutPF lg=new Login_withoutPF(driver);
        lg.setTxt_un("Admin");
        lg.setTxt_pwd("admin123");
        lg.setBtn_clk();

        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }

    @AfterClass
    void teardown(){
        driver.close();
    }


}
