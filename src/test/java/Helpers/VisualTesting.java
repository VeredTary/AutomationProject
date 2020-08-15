package Helpers;

import Utilities.CommonOps;
import Utilities.HelperMethods;
import org.testng.annotations.Test;

public class VisualTesting extends CommonOps
{
    @Test
    public void CreateScreenShot()
    {
        HelperMethods.TakeElementScreenshot(PracticeMainPage.Logo, "HeaderLogoVersion0.1");
    }
}
