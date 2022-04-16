package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelevisionPage {
    protected WebDriver driver;
    private By samsungBrand = By.xpath("//div[17]//ul[1]//li[4]//span[1]//a[1]//div[1]//label[1]//i[1]");

    public TelevisionPage(WebDriver driver){
        this.driver = driver;
    }

    public SamsungPage clickSamsungBrand(){
        driver.findElement(samsungBrand).click();
        return new SamsungPage(driver);

    }




}
