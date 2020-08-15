package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class AlarmClockFlows extends CommonOps
{
    @Step("Setting on the Alarm Clock")
    public static void AlarmClockOn(String Morning)
    {
        UIActions.click(MainAlarm.AddNewAlarm);
        UIActions.click(MainAlarm.Hour);
        UIActions.click(MainAlarm.Minutes);
        UIActions.click(MainAlarm.AM);
        UIActions.ClearText(MainAlarm.TextField);
        UIActions.UpdateText(MainAlarm.TextField, Morning);
        UIActions.click(MainAlarm.Repeat);
        UIActions.click(MainAlarm.SundayBox);
        UIActions.click(MainAlarm.WednesdayBox);
        UIActions.click(MainAlarm.CloseRepeat);
        UIActions.click(MainAlarm.SoundBTN);
        UIActions.click(MainAlarm.SoundType);
        UIActions.click(MainAlarm.Snooze);
        UIActions.click(MainAlarm.Disabled);
        UIActions.click(MainAlarm.SaveBTN);
    }

}
