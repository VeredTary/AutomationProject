package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPage01
{
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement MainSignin;

    @FindBy(how = How.XPATH, using = "//*[@id=\'email_create\']")
    public WebElement EmailAddressField;

    @FindBy(how = How.XPATH, using = "//*[@id=\'SubmitCreate\']")
    public WebElement CreateAccountBTN;

}
