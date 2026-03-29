package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class D11_Assertcls {
    //hard assert
    //Assert.fail()
    @Test
    void login(){
        System.out.println("login");
        Assert.assertEquals("12","12");
        Assert.assertTrue(true);
        System.out.println("login completed");
    }

    @Test
    void search(){
        System.out.println("search");
        Assert.assertNotEquals("12","12");
        System.out.println("search completed");
    }
    @Test
    void logout(){
        SoftAssert sa=new SoftAssert();
        System.out.println("logout");
        sa.assertEquals("12","121");
        System.out.println("logout completed");
        sa.assertAll();

    }
}
