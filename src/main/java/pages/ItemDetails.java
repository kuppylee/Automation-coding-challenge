package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ItemDetails {

    private final WebDriver driver;
    private By aboutItem = By.cssSelector("h1[class='a-size-base-plus a-text-bold']");
    private By aboutItemDetailedText = By.xpath("/html[1]/body[1]/div[2]/div[2]/div[5]/div[4]/div[4]/div[44]/div[1]/ul[1]/li");
    String detailedText;


    ItemDetails(WebDriver driver){
        this.driver = driver;
    }

    public String aboutItemText (){
        String text = driver.findElement(aboutItem).getText();
        return text;
    }

    public String getAboutItemDetailedText(){
        List<WebElement> detailedElements = driver.findElements(aboutItemDetailedText);

        for (int i = 0; i < detailedElements.size(); i++){
           detailedText = detailedElements.get(i).getText();
        }
        return detailedText;
    }





}
