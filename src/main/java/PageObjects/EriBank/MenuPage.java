package PageObjects.EriBank;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPage
{
    @FindBy(how = How.CLASS_NAME, using = "android.widget.ImageView")
    public WebElement EriBankLogo;

    @FindBy(how = How.ID, using = "makePaymentButton")
    public WebElement MakePaymentBTN;

    @FindBy(how = How.ID, using = "mortageRequestButton")
    public WebElement MortgagetBTN;

    @FindBy(how = How.ID, using = "expenseReportButton")
    public WebElement ExpensetBTN;

    @FindBy(how = How.ID, using = "logoutButton")
    public WebElement LogOutBTN;
}
