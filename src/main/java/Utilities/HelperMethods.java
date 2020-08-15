package Utilities;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.ashot.AShot;
import javax.imageio.ImageIO;
import java.io.File;

public class HelperMethods extends CommonOps
{
    public static void TakeElementScreenshot(WebElement ImageElement, String ImageName)
    {
        imageScreenShot = new AShot().takeScreenshot(driver,ImageElement);
        try
        {
            ImageIO.write(imageScreenShot.getImage(), "png", new File(getData("ImageRepo") + ImageName + ".png"));
        }
        catch (Exception e)
        {
            System.out.println("Image File Error, See Details: " + e);
        }
    }
}
