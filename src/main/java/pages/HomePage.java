package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By hamburgerMenu = By.id("nav-hamburger-menu");
    private By tvAppliancesElectronics = By.xpath("//body/div[@id='hmenu-container']/div[@id='hmenu-canvas']/div[@id='hmenu-content']/ul[1]/li[16]/a[1]");
    private By television = By.xpath("//a[contains(text(),'Televisions')]");
    private By

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
