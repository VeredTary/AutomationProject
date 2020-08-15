package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAddressPage
{
    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[1]")
    public WebElement UpdateBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[1]/div/div/ul/li[9]/a[2]")
    public WebElement DeleteBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div[2]/a")
    public WebElement AddNewAddressBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li[1]/a")
    public WebElement BackToAccountBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/ul/li/a")
    public WebElement HomeBTN;
}
