package Utilities;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.windows.WindowsDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.testng.annotations.Parameters;
import org.w3c.dom.Document;
import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CommonOps extends Base
{
    public static String getData (String nodeName)
    {
        DocumentBuilder dBuilder;
        Document doc = null;
        File fXmlFile = new File("./Configuration/DataConfig.xml");
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try
        {
            dBuilder = dbFactory.newDocumentBuilder();
            doc = dBuilder.parse(fXmlFile);
        }
        catch(Exception e)
        {
            System.out.println("Exception in reading XML file: " + e);
        }
        doc.getDocumentElement().normalize();
        return doc.getElementsByTagName(nodeName).item(0).getTextContent();
    }

    public static void initBrowser(String Browsertype)
    {
        if (Browsertype.equalsIgnoreCase("chrome"))
            driver = initChromeDriver();
        else if (Browsertype.equalsIgnoreCase("firefox"))
            driver = initFFDriver();
        else if (Browsertype.equalsIgnoreCase("ie"))
            driver = initIEDriver();
        else
            throw new RuntimeException("Invalid Platform Name Stated");
        driver.manage().window().maximize();
        driver.get(getData("url"));
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Long.parseLong(getData("TimeOut")));
        action = new Actions(driver);
    }

    public static WebDriver initChromeDriver()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        return driver;
    }

    public static WebDriver initFFDriver()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        return driver;
    }

    public static WebDriver initIEDriver()
    {
        WebDriverManager.iedriver().setup();
        driver = new InternetExplorerDriver();
        return driver;
    }

    public static void initMobile()
    {
        dc.setCapability(MobileCapabilityType.UDID, getData("UDID"));
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, getData("APP_PACKAGE"));
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, getData("APP_ACTIVITY"));
        try
        {
            driver = new RemoteWebDriver(new URL(getData("Appuim_Server") + "/wd/hub"), dc);
        }
        catch (Exception e)
        {
            System.out.println("Can not Connect to Appium Server, See Details: " + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }

    public static void initAPI()
    {
        RestAssured.baseURI = getData("url_api");
        httpRequest = RestAssured.given().auth().preemptive().basic(getData("user"), getData("password"));
    }

    public static void initElectron()
    {
        System.setProperty("webdriver.chrome.driver", getData("ElectronDriverPath"));
        ChromeOptions opt = new ChromeOptions();
        opt.setBinary(getData("ElectronAppPath"));
        dc.setCapability("chromeOptions", opt);
        dc.setBrowserName("chrome");
        driver = new ChromeDriver(dc);
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);
    }

    public static void initDesktop()
    {
        dc.setCapability("app",getData("Alarm_App"));
        try
        {
            driver = new WindowsDriver(new URL(getData("Appuim_Server")), dc);
        }
        catch (Exception e)
        {
            System.out.println("Can not Connect to Appium Server, See Details: " + e);
        }
        driver.manage().timeouts().implicitlyWait(Long.parseLong(getData("TimeOut")), TimeUnit.SECONDS);

    }

    @BeforeClass
    @Parameters({"PlatformName"})
    public void StartSession(String PlatformName)
    {
        Platform = PlatformName;
        if (Platform.equalsIgnoreCase("web"))
            initBrowser(getData("BrowserName"));
        else if (Platform.equalsIgnoreCase("mobile"))
            initMobile();
        else if (Platform.equalsIgnoreCase("Api"))
            initAPI();
        else if (Platform.equalsIgnoreCase("electron"))
            initElectron();
        else if (Platform.equalsIgnoreCase("desktop"))
            initDesktop();
        else
            throw new RuntimeException("Invalid Platform Name Stated");
        ManagePages.init();
        ManageDB.initConnection(getData("dbURL"), getData("dbUser"), getData("dbPassword"));
    }

    @AfterClass
    public void EndSession()
    {
        ManageDB.CloseConnection();
        if (!Platform.equalsIgnoreCase("Api"))
            driver.quit();
    }
}
