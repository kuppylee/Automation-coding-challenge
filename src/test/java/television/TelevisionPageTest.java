package television;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SamsungPage;
import pages.TelevisionPage;

public class TelevisionPageTest extends BaseTests {
    HomePage homePage = new HomePage(driver);

    @Test
    public void testTelevision(){
        homePage.clickHamburgerMenu();
        homePage.clickTvAppliancesElectronics();
        TelevisionPage televisionPage = homePage.clickTelevision();
        SamsungPage samsungPage = televisionPage.clickSamsungBrand();
        samsungPage.clickSortedByDropDownOptionsBy(2);

    }
}
