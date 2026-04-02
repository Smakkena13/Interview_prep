package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Login_withPF {

    //connstructor
    WebDriver driver;
    Login_withPF(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    //locator
    @FindBy(xpath = "//input[@name='username']")
    WebElement txt_un;

    @FindBy(xpath="//input[@name='password']")
    WebElement txt_pwd;

    @FindBy(how= How.XPATH,using="//button[@type='submit']")
    WebElement btn_clk;

    //action
    public void setTxt_un(String s){
        txt_un.sendKeys(s);
    }
    public void setTxt_pwd(String p){
        txt_pwd.sendKeys(p);
    }
    public void setBtn_clk(){
        btn_clk.click();
    }

}
