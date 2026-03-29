package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D11_Grouping {
    @Test(groups={"sanity"})
    void login(){
        System.out.println("login");
    }
    @Test(groups={"regression"})
    void search(){
        System.out.println("search");
    }
    @Test(groups={"sanity"})
    void advSearch(){
        System.out.println("advSearch");
    }
    @Test(groups={"sanity","regression","both"})
    void buy(){
        System.out.println("buy");
    }
    @Test(groups={"sanity","regression","both"})
    void pay(){
        System.out.println("pay");
    }
    @Test(groups={"regression"})
    void logout(){
        System.out.println("logout");
    }
}
