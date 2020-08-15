package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CostumerAccountPage
{
    @FindBy(how = How.XPATH, using = "//*[@id=\'header\']/div[2]/div/div/nav/div[1]/a")
    public WebElement AccountBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
    public WebElement OrderHistory;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[2]/a")
    public WebElement CreditSlips;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[3]/a")
    public WebElement MyAddress;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[1]/ul/li[4]/a")
    public WebElement PersonalInfo;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/div/div[2]/ul/li/a")
    public WebElement WishLists;

    @FindBy(how = How.XPATH, using = "//*[@id=\"center_column\"]/ul/li/a")
    public WebElement HomeBTN;
}
