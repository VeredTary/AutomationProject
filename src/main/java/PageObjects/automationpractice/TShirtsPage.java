package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TShirtsPage
{
    @FindBy(how = How.XPATH, using = "//*[@id=\'block_top_menu\']/ul/li[3]/a")
    public WebElement MainTShirts;

    @FindBy(how = How.ID, using = "color_1")
    public WebElement Color;

    @FindBy(how = How.XPATH, using = "//*[@id=\'group_1\']")
    public WebElement Size;

    @FindBy(how = How.XPATH, using = "//*[@id=\'add_to_cart\']/button")
    public WebElement AddtoCartBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'layer_cart\']/div[1]/div[1]/span")
    public WebElement CartXBTN;

    @FindBy(how = How.ID, using = "send_friend_button")
    public WebElement SendtoFriend;

    @FindBy(how = How.XPATH, using = "//*[@id=\'friend_name\']")
    public WebElement FriendName;

    @FindBy(how = How.XPATH, using = "//*[@id=\'friend_email\']")
    public WebElement FriendEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\'sendEmail\']")
    public WebElement SendEmail;

    @FindBy(how = How.XPATH, using = "//*[@id=\'product\']/div[2]/div/div/div/p[2]/input")
    public WebElement OkBTN;

    @FindBy(how = How.ID, using = "new_comment_tab_btn")
    public WebElement FirstReview;

    @FindBy(how = How.XPATH, using = "//*[@id=\'comment_title\']")
    public WebElement TitleReview;

    @FindBy(how = How.XPATH, using = "//*[@id=\'content\']")
    public WebElement CommentReview;

    @FindBy(how = How.XPATH, using = "//*[@id=\'submitNewMessage\']")
    public WebElement SendBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'product\']/div[2]/div/a")
    public WebElement XBTN;
}
