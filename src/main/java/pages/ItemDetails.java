package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ItemDetails {

    private final WebDriver driver;
    private final By aboutItem = By.cssSelector("h1[class='a-size-base-plus a-text-bold']");
    private final By aboutItemDetailedText = By.xpath("//ul[@class='a-unordered-list a-vertical a-spacing-mini']");
    private final List <String> detailedTexts = new ArrayList<>();



    ItemDetails(WebDriver driver){
        this.driver = driver;
    }

    public String aboutItemText (){
        String text = driver.findElement(aboutItem).getText();
        return text;
    }

    public List<String> getAboutItemDetailedText(){
        List<WebElement> detailedElements = driver.findElements(aboutItemDetailedText);
        detailedElements.stream().forEach(detailedText -> detailedTexts.add(detailedText.getText().trim()));
        return detailedTexts;
    }

    public void switchWindows(){
        Set<String> windows= driver.getWindowHandles();
        Iterator<String> windowIterator = windows.iterator();
        String parentId = windowIterator.next();
        String childId = windowIterator.next();
        // switching from parent to child window
        driver.switchTo().window(childId);
    }





}
