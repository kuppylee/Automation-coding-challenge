package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    protected final WebDriver driver;
    private final By hamburgerMenu = By.id("nav-hamburger-menu");
    private final By tvAppliancesElectronics = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[16]/a[1]");
    private final By television = By.xpath("//a[contains(text(),'Televisions')]");

    public  HomePage(WebDriver driver){
        this.driver = driver;
    }



    public void clickHamburgerMenu(){
        driver.findElement(hamburgerMenu).click();
    }

    public void clickTvAppliancesElectronics(){
        driver.findElement(tvAppliancesElectronics).click();
    }

    public TelevisionPage clickTelevision(){
        driver.findElement(television).click();
        return new TelevisionPage(driver);
    }
}
