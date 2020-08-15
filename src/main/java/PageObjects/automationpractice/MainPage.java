package PageObjects.automationpractice;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage
{
    @FindBy(how = How.CSS, using = "#header_logo > a > img")
    public WebElement Logo;

    @FindBy(how = How.CLASS_NAME, using = "bx-next")
    public WebElement NextArrow;

    @FindBy(how = How.XPATH, using = "//*[@id=\'homeslider\']/li[3]/div/p[2]/button")
    public WebElement Advertisement;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[2]/div/div[1]/div/a[1]/img")
    public WebElement Blouse;

    @FindBy(how = How.XPATH, using = "//*[@id=\"homefeatured\"]/li[2]/div/div[2]/div[2]/a[2]")
    public WebElement MoreBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\"view_full_size\"]/span")
    public WebElement ViewLarger;

    @FindBy(how = How.XPATH, using = "//*[@id=\"product\"]/div[2]/div/a")
    public WebElement ViewLargerXBTN;

    @FindBy(how = How.CLASS_NAME, using = "icon-plus")
    public WebElement IconPlus;

    @FindBy(how = How.XPATH, using = "//*[@id=\'group_1\']")
    public WebElement Size;

    @FindBy(how = How.ID, using = "color_8")
    public WebElement Color;

    @FindBy(how = How.XPATH, using = "//*[@id=\'add_to_cart\']/button")
    public WebElement AddtoCartBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'layer_cart\']/div[1]/div[2]/div[4]/span")
    public WebElement ContinueShopingBTN;

    @FindBy(how = How.ID, using = "wishlist_button")
    public WebElement AddtoWishlist;

    @FindBy(how = How.XPATH, using = "//*[@id=\'product\']/div[2]/div/div/a")
    public WebElement AddtoWishlistXBTN;

    @FindBy(how = How.CLASS_NAME, using = "open-comment-form")
    public WebElement WriteReview;

    @FindBy(how = How.XPATH, using = "//*[@id=\'comment_title\']")
    public WebElement WriteReviewTitle;

    @FindBy(how = How.XPATH, using = "//*[@id=\'content\']")
    public WebElement WriteReviewComment;

    @FindBy(how = How.XPATH, using = "//*[@id=\'submitNewMessage\']")
    public WebElement SendBTN;

    @FindBy(how = How.XPATH, using = "//*[@id=\'product\']/div[2]/div/div/div/p[2]/button")
    public WebElement OkBTN;
}
