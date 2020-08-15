package Utilities;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends CommonOps implements ITestListener
{
    public void onFinish(ITestContext execution)
    {
        System.out.println("----Execution Ended----");
    }

    public void onStart(ITestContext execution)
    {
        System.out.println("----Starting Execution----");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
    {
        // TODO Auto-generated method stub
    }

    public void onTestFailure(ITestResult test)
    {
        System.out.println("----Test: " + test.getName() + " Failed----");
        if (!Platform.equalsIgnoreCase("Api"))
             saveScreenshot ();
    }

    public void onTestSkipped(ITestResult test)
    {
        System.out.println("----Test: " + test.getName() + " Skipped----");
    }

    public void onTestStart(ITestResult test)
    {
        System.out.println("----Starting Test: " + test.getName() + " ----");
    }

    public void onTestSuccess(ITestResult test)
    {
        System.out.println("----Starting Test: " + test.getName() + " Passed----");
    }

    @Attachment( value = "Page ScreenShot", type = "image/png")
    public byte[] saveScreenshot ()
    {
        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
    }
}