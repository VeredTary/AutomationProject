package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.MobileFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class EriBankMobile extends CommonOps
{
    @Test(description = "Test01: User Login to EriBank Mobile App")
    @Description("Test Description: User Login to EriBank Mobile Application")
    public void Test01_Login()
    {
        MobileFlows.EriBankLogin("company", "company");
        Verifications.isDisplayed(EriBankMenu.EriBankLogo);
    }

    @Test(description = "Test02: User Makes Payment through EriBank App")
    @Description("Test Description: User Makes Payment through EriBank App")
    public void Test02_MakePayment()
    {
        MobileFlows.EriBankPayment("05477787656", "Rose Jackson", "200");
        Verifications.isDisplayed(EriBankMenu.EriBankLogo);
    }
}
