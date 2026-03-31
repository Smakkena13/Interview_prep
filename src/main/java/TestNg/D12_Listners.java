package TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class D12_Listners implements ITestListener {

    public void onStart(ITestContext result){
        System.out.println("on start ");
    }
    public void onTestStart(ITestResult result){
        System.out.println("test started");
    }
    public void onTestSuccess(ITestResult result) {
        System.out.println("test success");
    }
    public void onTestFailure(ITestResult result){
        System.out.println("test failure");
    }
    public void onTestSkipped(ITestResult result){
        System.out.println("test skipped");
    }
    public void onFinish(ITestContext result){
        System.out.println("on finish");
    }

}
