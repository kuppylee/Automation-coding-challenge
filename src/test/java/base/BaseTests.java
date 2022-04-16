package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.HomePage;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
        WebDriver driver;

        DesiredCapabilities dc = new DesiredCapabilities();
        if (browserName.equals("chrome")){
            dc.setBrowserName("chrome");
        }else if (browserName.equals("firefox")){
            dc.setBrowserName("firefox");
        }else if (browserName.equals("edge")){
            dc.setBrowserName("MicrosoftEdge");
        }

        driver = new RemoteWebDriver(new URL("http://localhost:4444"),dc);
        return driver;


    }


    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver 3");
        driver = new ChromeDriver();
        homePage = new  HomePage(driver);
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public  void tearDown(){
        driver.quit();
    }

}

