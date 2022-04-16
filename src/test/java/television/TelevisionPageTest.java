package television;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ItemDetails;
import pages.SamsungPage;
import pages.TelevisionPage;

import java.util.List;
import java.util.Set;

public class TelevisionPageTest extends BaseTests{

    @Test
    public void testTelevision() throws InterruptedException {
        Thread.sleep(3000);
        homePage.clickHamburgerMenu();
        homePage.clickTvAppliancesElectronics();
        TelevisionPage televisionPage = homePage.clickTelevision();
        Thread.sleep(5000);
        SamsungPage samsungPage = televisionPage.clickSamsungBrand();
        samsungPage.clickSortedBy();
        samsungPage.clickSortedByDropDownOptionsBy(2);
        Thread.sleep(3000);
        ItemDetails itemDetails = samsungPage.clickItem(1);
        itemDetails.switchWindows();
        String aboutText = itemDetails.aboutItemText();
        List<String> aboutItemDetailedText = itemDetails.getAboutItemDetailedText();
        Assert.assertEquals(aboutText,"About this item","This section is not available");
        System.out.println(aboutText + " \n " + aboutItemDetailedText);

    }
}
