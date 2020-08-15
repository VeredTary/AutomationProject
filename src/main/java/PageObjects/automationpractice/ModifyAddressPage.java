package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ModifyAddressPage
{
    @FindBy(how = How.XPATH, using = "//*[@id=\'firstname\']")
    public WebElement FirstName;

    @FindBy(how = How.XPATH, using = "//*[@id=\'lastname\']")
    public WebElement LastName;

    @FindBy(how = How.XPATH, using = "//*[@id=\'submitAddress\']")
    public WebElement SaveBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/ul/li/a")
    public WebElement BackToAccountBTN;
}
