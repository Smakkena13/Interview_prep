package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D11_Dependson {
    @Test
    void login(){
        System.out.println("login");

    }
    @Test(dependsOnMethods="login")
    void search(){
        System.out.println("search");
        Assert.fail();
    }
    @Test(dependsOnMethods={"login","search"})
    void advSearch(){
        System.out.println("advSearch");
    }
    @Test(dependsOnMethods="login")
    void logout(){
        System.out.println("logout");
    }
}
