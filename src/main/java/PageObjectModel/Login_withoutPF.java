package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_withoutPF {

    //constructor
    WebDriver driver;
    Login_withoutPF(WebDriver driver){
        this.driver=driver;
    }

    //locators
    By txt_un=By.xpath("//input[@name='username']");
    By txt_pwd=By.xpath("//input[@name='password']");
    By btn_clk=By.xpath("//button[@type='submit']");

    //actions
    public void setTxt_un(String name){
        driver.findElement(txt_un).sendKeys(name);
    }

    public void setTxt_pwd(String p){
        driver.findElement(txt_pwd).sendKeys(p);
    }

    public void setBtn_clk(){
        driver.findElement(btn_clk).click();
    }


}
