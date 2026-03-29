package TestNg;

import org.testng.annotations.Test;

public class D11_test {
    //without main method we can use @Test annotation
    //it will execute in alphabetical order
    //we can give priority to control the order of execution
    //can give -ve also in priorities
    //if have same priority then it will execute in alphabetical order

    @Test(priority = -1)
    void testLogin(){
        System.out.println("login into app");
    }

    @Test(priority = 1)
    void testSearch(){
        System.out.println("searching in app");
    }

    @Test(priority = 1)
    void testLogout(){
        System.out.println("logout from app");
    }
}
