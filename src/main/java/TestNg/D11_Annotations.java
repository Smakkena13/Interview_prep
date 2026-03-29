package TestNg;

import org.testng.annotations.*;

public class D11_Annotations {

    @BeforeSuite
    void testbs(){
        System.out.println("Before suite");
    }
    @AfterSuite
    void testas(){
        System.out.println("After suite");
    }
    @BeforeTest
    void testbt(){
        System.out.println("Before test");
    }
    @AfterTest
    void testat(){
        System.out.println("After test");
    }
    @BeforeClass
    void testbc(){
        System.out.println("Before class");
    }
    @AfterClass
    void testac(){
        System.out.println("After class");
    }
    @BeforeMethod
    void testbm(){
        System.out.println("Before method");
    }
    @AfterMethod
    void testam(){
        System.out.println("After method");
    }
    @Test(priority = 1)
    void testt1(){
        System.out.println("Test 1");
    }

    @Test(priority = 2)
    void test2(){
        System.out.println("Test 2");
    }

}
