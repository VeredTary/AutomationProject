package PageObjects.ElectronAPIDemo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage
{
    @FindBy(how = How.ID, using = "button-windows")
    public WebElement ManageWindowBTN;

    @FindBy(how = How.ID, using = "button-crash-hang")
    public WebElement CrashWindowBTN;

    @FindBy(how = How.ID, using = "button-menus")
    public WebElement CustomizeMenuBTN;

    @FindBy(how = How.ID, using = "button-shortcuts")
    public WebElement KeyboardShortcutBTN;

    @FindBy(how = How.ID, using = "button-dialogs")
    public WebElement SystemDialogBTN;

    @FindBy(how = How.ID, using = "button-tray")
    public WebElement AppTrayBTN;

    @FindBy(how = How.ID, using = "button-ipc")
    public WebElement CommunicationProcessBTN;

    @FindBy(how = How.ID, using = "button-app-sys-information")
    public WebElement SystemInfoBTN;
}
