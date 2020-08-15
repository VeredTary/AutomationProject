package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class MobileFlows extends CommonOps
{
    @Step("EriBank Login")
    public static void EriBankLogin(String UserName, String Password)
    {
        UIActions.UpdateText(EriBankLogin.UserName, UserName);
        UIActions.UpdateText(EriBankLogin.Password, Password);
        UIActions.click(EriBankLogin.Login_BTN);
    }

    @Step("EriBank Make Payment")
    public static void EriBankPayment(String PhoneNumber, String Name, String Amount)
    {
        UIActions.click(EriBankMenu.MakePaymentBTN);
        UIActions.UpdateText(EriBankPayment.PhoneField, PhoneNumber);
        UIActions.UpdateText(EriBankPayment.NameField, Name);
        UIActions.UpdateText(EriBankPayment.AmountField, Amount);
        UIActions.click(EriBankPayment.SelectBTN);
        UIActions.click(EriBankPayment.USACounty);
        UIActions.click(EriBankPayment.SendBTN);
        UIActions.click(EriBankPayment.YesBTN);
    }
}
