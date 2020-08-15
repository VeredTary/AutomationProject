package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class UIActions extends CommonOps
{
    @Step("Click on Element")
    public static void click(WebElement Elem)
    {
        Elem.click();
    }

    @Step("Delete Existing Field Text")
    public static void ClearText(WebElement Elem)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
        wait.until(ExpectedConditions.visibilityOf(Elem));
        Elem.clear();
    }

    @Step("Adding Text to the Field ")
    public static void UpdateText(WebElement Elem, String Value)
    {
        if (!Platform.equalsIgnoreCase("mobile") && !Platform.equalsIgnoreCase("electron") && !Platform.equalsIgnoreCase("desktop"))
            wait.until(ExpectedConditions.visibilityOf(Elem));
        Elem.sendKeys(Value);
    }

    @Step("Update Drop down Field")
    public static void UpdateDropDown(WebElement Elem, String Value)
    {
        Select MyValue = new Select(Elem);
        MyValue.selectByVisibleText(Value);
    }

    @Step("Page Scroll Down")
    public static void Scroll(int x, int y)
    {
        ((JavascriptExecutor)driver).executeScript("scrollTo(" + x+"," + y+");");
    }

    @Step("Mouse Over to Element")
    public static void MouseHoverElements(WebElement Elem1, WebElement Elem2)
    {
        action.moveToElement(Elem1).moveToElement(Elem2).click().build().perform();
    }

}
