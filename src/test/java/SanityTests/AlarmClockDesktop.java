package SanityTests;

import Extensions.Verifications;
import Utilities.CommonOps;
import WorkFlows.AlarmClockFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Utilities.listeners.class)
public class AlarmClockDesktop extends CommonOps
{
    @Test(description = "Test01: Set the Alarm Clock on")
    @Description("Test Description: Set the Alarm Clock on every day except Sunday and Wednesday")
    public void Test01_SetAlarmOn()
    {
        AlarmClockFlows.AlarmClockOn("Good Morning");
        Verifications.TextinElement(MainAlarm.Toggle, "Good Morning");
    }

}
