package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage02
{
    @FindBy(how = How.ID, using = "id_gender2")
    public WebElement Gender;

    @FindBy(how = How.XPATH, using = "//*[@id=\'customer_firstname\']")
    public WebElement FirstNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\"customer_lastname\"]")
    public WebElement LastNameField;

    @FindBy(how = How.XPATH, using = "//*[@id=\'passwd\']")
    public WebElement PassField;

    @FindBy(how = How.XPATH, using = "//*[@id=\'days\']")
    public WebElement BirthDay;

    @FindBy(how = How.XPATH, using = "//*[@id=\'months\']")
    public WebElement BirthMonth;

    @FindBy(how = How.XPATH, using = "//*[@id=\'years\']")
    public WebElement BirthYear;

    @FindBy(how = How.XPATH, using = "//*[@id=\'newsletter\']")
    public WebElement NewsletterCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\'optin\']")
    public WebElement OffersCheckBox;

    @FindBy(how = How.XPATH, using = "//*[@id=\'address1\']")
    public WebElement Address;

    @FindBy(how = How.XPATH, using = "//*[@id=\'city\']")
    public WebElement City;

    @FindBy(how = How.XPATH, using = "//*[@id=\'id_state\']")
    public WebElement State;

    @FindBy(how = How.XPATH, using = "//*[@id=\'postcode\']")
    public WebElement ZipCode;

    @FindBy(how = How.XPATH, using = "//*[@id=\'id_country\']")
    public WebElement Country;

    @FindBy(how = How.XPATH, using = "//*[@id=\'phone_mobile\']")
    public WebElement MobilePhone;

    @FindBy(how = How.XPATH, using = "//*[@id=\'alias\']")
    public WebElement AddressAlias;

    @FindBy(how = How.XPATH, using = "//*[@id=\'submitAccount\']")
    public WebElement RegisterBTN;
}
