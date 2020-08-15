package PageObjects.ElectronAPIDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SystemInfoPage
{
    @FindBy(how = How.ID, using = "app-info-demo-toggle")
    public WebElement AppInfoBTN;

    @FindBy(how = How.ID, using = "app-version-demo-toggle")
    public WebElement VersionInfoBTN;

    @FindBy(how = How.ID, using = "sys-info-demo-toggle")
    public WebElement SysInfoBTN;

    @FindBy(how = How.ID, using = "screen-info-demo-toggle")
    public WebElement ScreenInfoBTN;
}
