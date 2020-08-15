package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOut
{
    @FindBy(how = How.CLASS_NAME, using = "logout")
    public WebElement SignOut;
}
