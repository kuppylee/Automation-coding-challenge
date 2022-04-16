package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TelevisionPage {
    protected WebDriver driver;
    private By samsungBrand = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Samsung']");

    public TelevisionPage(WebDriver driver){
        this.driver = driver;
    }

    public SamsungPage clickSamsungBrand(){
        driver.findElement(samsungBrand).click();
        return new SamsungPage(driver);

    }




}
