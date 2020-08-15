package PageObjects.AlarmClock;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage
{
    @FindBy(how = How.NAME, using = "Add new alarm")
    public WebElement AddNewAlarm;

    @FindBy(how = How.NAME, using = "8")
    public WebElement Hour;

    @FindBy(how = How.NAME, using = "30")
    public WebElement Minutes;

    @FindBy(how = How.NAME, using = "AM")
    public WebElement AM;

    @FindBy(how = How.CLASS_NAME, using = "TextBox")
    public WebElement TextField;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='AlarmRepeatsToggleButton']")
    public WebElement Repeat;

    @FindBy(how = How.NAME, using = "Sunday")
    public WebElement SundayBox;

    @FindBy(how = How.NAME, using = "Wednesday")
    public WebElement WednesdayBox;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='AlarmSoundButton']")
    public WebElement SoundBTN;

    @FindBy(how = How.NAME, using = "Jingle")
    public WebElement SoundType;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='AlarmSnoozeCombobox']")
    public WebElement Snooze;

    @FindBy(how = How.NAME, using = "Disabled")
    public WebElement Disabled;

    @FindBy(how = How.XPATH, using = "//*[@AutomationId='AlarmSaveButton']")
    public WebElement SaveBTN;

    @FindBy(how = How.CLASS_NAME, using = "ToggleSwitch")
    public WebElement Toggle;

    @FindBy(how = How.NAME, using = "Close")
    public WebElement CloseRepeat;

}
