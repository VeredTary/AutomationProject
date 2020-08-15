package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class DressesPage
{
    @FindBy(how = How.XPATH, using = "//*[@id=\'block_top_menu\']/ul/li[2]/a")
    public WebElement MainDresses;

    @FindBy(how = How.XPATH, using = "//*[@id=\'subcategories\']/ul/li[2]/div[1]/a")
    public WebElement EveningDresses;

    @FindBy(how = How.XPATH, using = "//*[@id=\'selectProductSort\']")
    public WebElement SortBy;

    @FindBy(how = How.CLASS_NAME, using = "icon-th-list")
    public WebElement ListIcon;

    @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/ul/li/div/div/div[3]/div/div[2]/a[2]")
    public WebElement MoreBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'group_1\']")
    public WebElement Size;

    @FindBy(how = How.ID, using = "color_24")
    public WebElement Color;

    @FindBy(how = How.XPATH, using = "//*[@id=\'add_to_cart\']/button")
    public WebElement AddtoCartBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'layer_cart\']/div[1]/div[1]/span")
    public WebElement CartXBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'columns\']/div[1]/a[4]")
    public WebElement BackToEveningDresses;

    @FindBy(how = How.CLASS_NAME, using = "add_to_compare")
    public WebElement AddtoCompare;

    @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/div[2]/div[2]/form/button")
    public WebElement CompareBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'center_column\']/ul/li/a")
    public WebElement ContinueShopping;



}
