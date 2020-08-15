package PageObjects.EriBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MakePaymentPage
{
    @FindBy(how = How.ID, using = "phoneTextField")
    public WebElement PhoneField;

    @FindBy(how = How.ID, using = "nameTextField")
    public WebElement NameField;

    @FindBy(how = How.ID, using = "amountTextField")
    public WebElement AmountField;

    @FindBy(how = How.ID, using = "countryButton")
    public WebElement SelectBTN;

    @FindBy(how = How.XPATH, using = "//*[@text='USA']")
    public WebElement USACounty;

    @FindBy(how = How.ID, using = "sendPaymentButton")
    public WebElement SendBTN;

    @FindBy(how = How.ID, using = "cancelButton")
    public WebElement CancelBTN;

    @FindBy(how = How.ID, using = "button1")
    public WebElement YesBTN;

    @FindBy(how = How.ID, using = "button2")
    public WebElement NoBTN;
}
