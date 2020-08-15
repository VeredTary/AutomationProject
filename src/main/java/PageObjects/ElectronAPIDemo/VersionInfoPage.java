package PageObjects.ElectronAPIDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VersionInfoPage
{
    @FindBy(how = How.ID, using = "version-info")
    public WebElement ViewDemoBTN;

    @FindBy(how = How.ID, using = "got-version-info")
    public WebElement AppVersionText;
}
