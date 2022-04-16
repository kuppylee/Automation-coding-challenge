package television;

import base.BaseTests;
import pages.HomePage;
import pages.TelevisionPage;

public class TelevisionPageTest extends BaseTests {
    HomePage homePage = new HomePage(driver);

    public void testFilterByBrand(){
        homePage.clickHamburgerMenu();
        homePage.clickTvAppliancesElectronics();
        TelevisionPage televisionPage = homePage.clickByTelevisionBrand();

    }
}
