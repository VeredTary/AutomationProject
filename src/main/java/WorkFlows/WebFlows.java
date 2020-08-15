package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class WebFlows extends CommonOps
{
    @Step("Sign Up For a New User Page #1")
    public static void SingUpStep01(String Email)
    {
        UIActions.click(SignUp01.MainSignin);
        UIActions.Scroll(0, 1000);
        UIActions.UpdateText(SignUp01.EmailAddressField, Email);
        UIActions.click(SignUp01.CreateAccountBTN);
    }

    @Step("Continue Sign Up For a New User Page #2")
    public static void SingUpStep02(String FirstName, String LastName, String Password, String Value, String Value01, String Value02, String Address, String City, String Value03, String ZipCode, String Phone)
    {
        UIActions.click(SignUp02.Gender);
        UIActions.UpdateText(SignUp02.FirstNameField, FirstName);
        UIActions.UpdateText(SignUp02.LastNameField, LastName);
        UIActions.UpdateText(SignUp02.PassField, Password);
        UIActions.Scroll(0,1000);
        UIActions.UpdateDropDown(SignUp02.BirthDay, Value);
        UIActions.UpdateDropDown(SignUp02.BirthMonth, Value01);
        UIActions.UpdateDropDown(SignUp02.BirthYear, Value02);
        UIActions.click(SignUp02.NewsletterCheckBox);
        UIActions.click(SignUp02.OffersCheckBox);
        UIActions.UpdateText(SignUp02.Address, Address);
        UIActions.UpdateText(SignUp02.City, City);
        UIActions.Scroll(0,500);
        UIActions.UpdateDropDown(SignUp02.State, Value03);
        UIActions.UpdateText(SignUp02.ZipCode, ZipCode);
        UIActions.UpdateText(SignUp02.MobilePhone, Phone);
        UIActions.click(SignUp02.RegisterBTN);
        UIActions.Scroll(0,1000);
        UIActions.click(PracticeMyAddress.HomeBTN);
    }

    @Step("Edit User Information")
    public static void EditInfo(String Value, String Value01)
    {
        UIActions.click(PracticeCostumerAccount.AccountBTN);
        UIActions.Scroll(0,500);
        UIActions.click(PracticeCostumerAccount.MyAddress);
        UIActions.Scroll(0,500);
        UIActions.click(PracticeMyAddress.UpdateBTN);
        UIActions.ClearText(PracticeModifyAddress.FirstName);
        UIActions.UpdateText(PracticeModifyAddress.FirstName, Value);
        UIActions.ClearText(PracticeModifyAddress.LastName);
        UIActions.UpdateText(PracticeModifyAddress.LastName, Value01);
        UIActions.Scroll(0,1000);
        UIActions.click(PracticeModifyAddress.SaveBTN);
        UIActions.click(PracticeMyAddress.HomeBTN);
    }

    @Step("User Sign Out")
    public static void SignOut()
    {
        UIActions.click(PracticeSignOut.SignOut);
    }

    @Step("User Login")
    public static void Signin(String Email, String Password)
    {
        UIActions.click(PracticeLogin.MainSignin);
        UIActions.Scroll(0, 500);
        UIActions.UpdateText(PracticeLogin.EmailLogin, Email);
        UIActions.UpdateText(PracticeLogin.PassLogin, Password);
        UIActions.click(PracticeLogin.SigninBTN);
        UIActions.click(PracticeLogin.HomeIcon);
    }

    @Step("Main Page - Blouse Product")
    public static void MainPage(String Value, String Value02)
    {
        UIActions.Scroll(0, 400);
        UIActions.click(PracticeMainPage.NextArrow);
        UIActions.click(PracticeMainPage.Advertisement);
        driver.navigate().back();
        UIActions.Scroll(0, 300);
        UIActions.MouseHoverElements(PracticeMainPage.Blouse, PracticeMainPage.MoreBTN);
        UIActions.Scroll(0, 300);
        UIActions.click(PracticeMainPage.ViewLarger);
        UIActions.click(PracticeMainPage.ViewLargerXBTN);
        UIActions.click(PracticeMainPage.IconPlus);
        UIActions.click(PracticeMainPage.Size);
        UIActions.click(PracticeMainPage.Color);
        UIActions.click(PracticeMainPage.AddtoCartBTN);
        UIActions.click(PracticeMainPage.ContinueShopingBTN);
        UIActions.click(PracticeMainPage.AddtoWishlist);
        UIActions.click(PracticeMainPage.AddtoWishlistXBTN);
        UIActions.click(PracticeMainPage.WriteReview);
        UIActions.UpdateText(PracticeMainPage.WriteReviewTitle, Value);
        UIActions.UpdateText(PracticeMainPage.WriteReviewComment, Value02);
        UIActions.click(PracticeMainPage.SendBTN);
        UIActions.click(PracticeMainPage.OkBTN);
    }

    @Step("Evening Dress Product")
    public static void DressesPage(String Value, String Value02)
    {
        UIActions.click(PracticeDressesPage.MainDresses);
        UIActions.Scroll(0,650);
        UIActions.click(PracticeDressesPage.EveningDresses);
        UIActions.Scroll(0,650);
        UIActions.UpdateDropDown(PracticeDressesPage.SortBy, Value);
        UIActions.click(PracticeDressesPage.ListIcon);
        UIActions.click(PracticeDressesPage.MoreBTN);
        UIActions.UpdateDropDown(PracticeDressesPage.Size, Value02);
        UIActions.click(PracticeDressesPage.Color);
        UIActions.click(PracticeDressesPage.AddtoCartBTN);
        UIActions.click(PracticeDressesPage.CartXBTN);
        UIActions.click(PracticeDressesPage.BackToEveningDresses);
        UIActions.Scroll(0,650);
        UIActions.click(PracticeDressesPage.AddtoCompare);
        UIActions.click(PracticeDressesPage.CompareBTN);
        UIActions.Scroll(0,1000);
        UIActions.click(PracticeDressesPage.ContinueShopping);
    }

    @Step("TShirt Product")
    public static void TShirstPage(String Size, String NameFriend, String EmailFriend, String TitleReview, String CommentReview)
    {
        UIActions.click(PracticeTShirtsPage.MainTShirts);
        UIActions.Scroll(0,650);
        UIActions.click(PracticeTShirtsPage.Color);
        UIActions.Scroll(0,750);
        UIActions.UpdateDropDown(PracticeTShirtsPage.Size, Size);
        UIActions.click(PracticeTShirtsPage.AddtoCartBTN);
        UIActions.click(PracticeTShirtsPage.CartXBTN);
        UIActions.click(PracticeTShirtsPage.SendtoFriend);
        UIActions.UpdateText(PracticeTShirtsPage.FriendName, NameFriend);
        UIActions.UpdateText(PracticeTShirtsPage.FriendEmail, EmailFriend);
        UIActions.click(PracticeTShirtsPage.SendEmail);
        UIActions.click(PracticeTShirtsPage.OkBTN);
        UIActions.Scroll(0,650);
        UIActions.click(PracticeTShirtsPage.FirstReview);
        UIActions.UpdateText(PracticeTShirtsPage.TitleReview, TitleReview);
        UIActions.UpdateText(PracticeTShirtsPage.CommentReview, CommentReview);
        UIActions.click(PracticeTShirtsPage.SendBTN);
        UIActions.click(PracticeTShirtsPage.XBTN);
        UIActions.click(PracticeLogin.HomeIcon);
    }


}
