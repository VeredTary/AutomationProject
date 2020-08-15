package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.SQLException;
import java.util.List;

import static org.junit.Assert.*;

public class Verifications extends CommonOps
{

    @Step("Verify Text in Element")
    public static void TextinElement(WebElement Elem, String ExpectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
             wait.until(ExpectedConditions.visibilityOf(Elem));
            assertEquals(Elem.getText(), ExpectedValue);
    }

    @Step("Verify Element is Displayed")
    public static void isDisplayed(WebElement Elem)
    {
        assertTrue(Elem.isDisplayed());
    }

    @Step("Verify String is Displayed")
    public static void StringDisplayed(String Value) throws SQLException
    {
        assertEquals(rs.getString(1), Value);
    }

    @Step("Verify Number of Elements")
    public static void NumberofElements(List<WebElement> Elems, int ExpectedValue)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(Elems.get(Elems.size()-1)));
        assertEquals(Elems.size(), ExpectedValue);
    }

    @Step("Verify Element Visability")
    public static void VisualElement(WebElement ImageElement, String ExpectedImageName)
    {
        BufferedImage ExpectedImage = null;
        try
        {
            ExpectedImage = ImageIO.read(new File(getData("ImageRepo") + ExpectedImageName + ".png"));
        } catch (Exception e)
        {
            System.out.println("Error reading image file: " + e);
        }
        Screenshot imageScreenshot = new AShot().takeScreenshot(driver, ImageElement);
        BufferedImage actualImage = imageScreenshot.getImage();
        diff = imgDiff.makeDiff(actualImage, ExpectedImage);
        assertFalse("Images are not the same", diff.hasDiff());
    }
    @Step("Verify Text with Text")
    public static void Text(String ActualText, String ExpectedText)
    {
        assertEquals(ActualText, ExpectedText);
    }
}
