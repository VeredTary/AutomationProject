package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.ElectronFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class ElectronDemo extends CommonOps
{
    @Test(description = "Verify Electron App Version Number")
    @Description("Test Description: Getting the Electron App Version Number")
    public void Test01_ElectronDemoVersion()
    {
        ElectronFlows.ElectronVersion();
        Verifications.TextinElement(ElectronAppVersion.AppVersionText, "This app is using Electron version: 1.6.2");
    }
}
