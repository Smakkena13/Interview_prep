package TestNg;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNg.D12_Listners.class)
public class D11_test {
    //without main method we can use @Test annotation
    //it will execute in alphabetical order
    //we can give priority to control the order of execution
    //can give -ve also in priorities
    //if have same priority then it will execute in alphabetical order

    @Test(priority = 1)
    void testLogin(){
        System.out.println("login into app");
        Assert.fail();
    }

    @Test(priority = 2,dependsOnMethods = {"testLogin"})
    void testSearch(){
        System.out.println("searching in app");
        Assert.assertTrue(true);
    }

    @Test(priority = 3)
    void testLogout(){
        System.out.println("logout from app");
        Assert.assertTrue(true);
    }
}
