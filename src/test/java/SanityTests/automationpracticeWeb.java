package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.WebFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class automationpracticeWeb extends CommonOps
{
    @Test(description = "Test01: User Registration to Automation Practice")
    @Description("Test Description: User Registration to Automation Practice Web Application")
    public void Test01_SignUp()
    {
       WebFlows.SingUpStep01("Vered50@gmail.com");
        WebFlows.SingUpStep02("Vered", "Tarnavsky", "123456", "2  ", "April ", "1987  ","120-136 SE 14th Terrance", "Miami", "Florida", "33133", "786+1-866-693-6748");
        Verifications.isDisplayed(PracticeMyAddress.HomeBTN);
    }

    @Test(description = "Test02: User SignOut and then Signin to Automation Practice")
    @Description("Test Description: User Logging Out and In to Automation Practice Web Application")
    public void Test02_SignOutAndIn()
    {
        WebFlows.SignOut();
        WebFlows.Signin("Vered50@gmail.com", "123456");
        Verifications.isDisplayed(PracticeMyAddress.HomeBTN);
    }

    @Test(description = "Test03: User Chooses Wearing Products")
    @Description("Test Description: User Chooses Blouse, TShirt and Dress to Purchase")
    public void Test03_Products()
    {
        WebFlows.MainPage("White Blouse", "Very Nice Blouse");
        WebFlows.DressesPage("Product Name: A to Z","M");
        WebFlows.TShirstPage("L", "Sharon", "Sharon@gmail.com", "BlueT-Shirt", "Very good shirt, Exactly my size");
        Verifications.isDisplayed(PracticeMyAddress.HomeBTN);
    }

    @Test(description = "Test04: User Edits Information")
    @Description("Test Description: User Is Editing His Account Info Name and LastName")
    public void Test04_EditInfo()
    {
        WebFlows.EditInfo("Shani", "Gabai");
        Verifications.isDisplayed(PracticeMyAddress.HomeBTN);
    }

    @Test(description = "Test05: Verify Logo")
    @Description("Test Description: Verify Website Header Logo")
    public void Test05_VerifyLogo()
    {
        Verifications.VisualElement(PracticeMainPage.Logo, "HeaderLogo");
    }

}
