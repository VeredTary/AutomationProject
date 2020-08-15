package PageObjects.EriBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage
{
    @FindBy(how = How.ID, using = "usernameTextField")
    public WebElement UserName;

    @FindBy(how = How.ID, using = "passwordTextField")
    public WebElement Password;

    @FindBy(how = How.ID, using = "loginButton")
    public WebElement Login_BTN;
}
