package Utilities;

import PageObjects.automationpractice.*;
import org.openqa.selenium.support.PageFactory;

public class ManagePages extends Base
{
    public static void init()
    {
        PracticeLogin = PageFactory.initElements(driver,PageObjects.automationpractice.LoginPage.class);
        SignUp01 = PageFactory.initElements(driver, SignUpPage01.class);
        SignUp02 = PageFactory.initElements(driver, SignUpPage02.class);
        PracticeCostumerAccount = PageFactory.initElements(driver, CostumerAccountPage.class);
        PracticeMyAddress = PageFactory.initElements(driver, MyAddressPage.class);
        PracticeModifyAddress = PageFactory.initElements(driver, ModifyAddressPage.class);
        PracticeMainPage = PageFactory.initElements(driver, MainPage.class);
        PracticeDressesPage = PageFactory.initElements(driver, DressesPage.class);
        PracticeTShirtsPage = PageFactory.initElements(driver, TShirtsPage.class);
        PracticeSignOut = PageFactory.initElements(driver, SignOut.class);

        EriBankLogin = PageFactory.initElements(driver, PageObjects.EriBank.LoginPage.class);
        EriBankMenu = PageFactory.initElements(driver, PageObjects.EriBank.MenuPage.class);
        EriBankPayment = PageFactory.initElements(driver, PageObjects.EriBank.MakePaymentPage.class);

        ElectronMenu = PageFactory.initElements(driver, PageObjects.ElectronAPIDemo.MainPage.class);
        ElectronSystemInfo = PageFactory.initElements(driver, PageObjects.ElectronAPIDemo.SystemInfoPage.class);
        ElectronAppVersion = PageFactory.initElements(driver, PageObjects.ElectronAPIDemo.VersionInfoPage.class);
        MainAlarm = PageFactory.initElements(driver, PageObjects.AlarmClock.MainPage.class);
    }
}
