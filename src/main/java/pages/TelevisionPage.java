package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelevisionPage {
    private WebDriver driver;
    private By samsungBrand = By.xpath("//span[contains(text(),'Samsung')]");

    public TelevisionPage(WebDriver driver){
        this.driver = driver;
    }

    public SamsungPage clickSamsungBrand(){
        driver.findElement(samsungBrand).click();
        return SamsungPage;

    }




}
