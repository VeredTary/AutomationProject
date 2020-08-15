package WorkFlows;

import Extensions.UIActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;

public class ElectronFlows extends CommonOps
{
    @Step("Electron App Version Number")
    public static void ElectronVersion()
    {
        UIActions.click(ElectronMenu.SystemInfoBTN);
        UIActions.click(ElectronSystemInfo.VersionInfoBTN);
        UIActions.click(ElectronSystemInfo.VersionInfoBTN);
        UIActions.click(ElectronAppVersion.ViewDemoBTN);
    }

}
