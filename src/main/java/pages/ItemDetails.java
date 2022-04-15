package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemDetails {

    private final WebDriver driver;
    private By aboutItem = By.cssSelector("h1[class='a-size-base-plus a-text-bold']");

    ItemDetails(WebDriver driver){
        this.driver = driver;
    }

    public String aboutItemText (){
        String text = driver.findElement(aboutItem).getText();
        return text;
    }



}
