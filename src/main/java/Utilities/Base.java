package Utilities;

import PageObjects.automationpractice.*;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class Base
{
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Actions action;
    public static Screenshot imageScreenShot;
    public static ImageDiffer imgDiff = new ImageDiffer();
    public static ImageDiff diff;
    public static DesiredCapabilities dc = new DesiredCapabilities();
    public static String Platform;

    public static PageObjects.automationpractice.LoginPage PracticeLogin;
    public static SignUpPage01 SignUp01;
    public static SignUpPage02 SignUp02;
    public static CostumerAccountPage PracticeCostumerAccount;
    public static MyAddressPage PracticeMyAddress;
    public static ModifyAddressPage PracticeModifyAddress;
    public static MainPage PracticeMainPage;
    public static DressesPage PracticeDressesPage;
    public static TShirtsPage PracticeTShirtsPage;
    public static SignOut PracticeSignOut;

    public static PageObjects.EriBank.LoginPage EriBankLogin;
    public static PageObjects.EriBank.MenuPage EriBankMenu;
    public static PageObjects.EriBank.MakePaymentPage EriBankPayment;

    public static PageObjects.ElectronAPIDemo.MainPage ElectronMenu;
    public static PageObjects.ElectronAPIDemo.SystemInfoPage ElectronSystemInfo;
    public static PageObjects.ElectronAPIDemo.VersionInfoPage ElectronAppVersion;

    public static PageObjects.AlarmClock.MainPage MainAlarm;

    public static RequestSpecification httpRequest;
    public static Response response;
    public static JSONObject requestParams = new JSONObject();
    public static JsonPath jp;

    public static Connection con;
    public static Statement stmt;
    public static ResultSet rs;
}
