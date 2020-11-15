package Utilities;

import io.qameta.allure.Attachment;
import junit.framework.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends commonOps implements ITestListener
{
    public void onFinish(ITestContext arg0)
    {
        System.out.println("--------------Ending execution--------------");
    }

    public void onStart(ITestContext arg0)
    {
        System.out.println("--------------starting execution--------------");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        // TODO Auto-generated method stub
    }

    public void onTestFailure(ITestResult arg0)
    {
        System.out.println("test: " + "Failed------------");
        if (!platform.equalsIgnoreCase("api"))
        saveScreenShot();
    }

    public void onTestSkipped(ITestResult arg0)
    {
        // TODO Auto-generated method stub
    }

    public void onTestStart(ITestResult arg0)
    {
        System.out.println("--------------starting test-------------");
    }

    public void onTestSuccess(ITestResult arg0)
    {
        System.out.println("--------------test: "+  "passed------");
    }

    @Attachment (value = "Page screen-shot", type = "image/png")
    public byte[] saveScreenShot()
    {

        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}
