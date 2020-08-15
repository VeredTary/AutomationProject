package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    @FindBy(how = How.LINK_TEXT, using = "Sign in")
    public WebElement MainSignin;

    @FindBy(how = How.XPATH, using = "//*[@id=\'email\']")
    public WebElement EmailLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\'passwd\']")
    public WebElement PassLogin;

    @FindBy(how = How.XPATH, using = "//*[@id=\'SubmitLogin\']")
    public WebElement SigninBTN;

    @FindBy(how = How.LINK_TEXT, using = "Forgot your password?")
    public WebElement ForgotPassLink;

    @FindBy(how = How.CLASS_NAME, using = "icon-home")
    public WebElement HomeIcon;
}
