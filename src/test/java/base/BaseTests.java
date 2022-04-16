package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver 3");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        homePage = new HomePage(driver);
        driver.manage().window().maximize();
    }

    @AfterClass
    public  void quit(){
        driver.quit();
    }

}

