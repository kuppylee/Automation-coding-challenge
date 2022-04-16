package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SamsungPage {

    private WebDriver driver;
    //    protected WebDriver driver;
    private  By samsungTvLocator =By.xpath("//div[@class='a-section a-spacing-base']");
    private By clickSort = By.xpath("//span[@class='a-dropdown-container']");
    private By sortBy = By.id("s-result-sort-select");


    SamsungPage(WebDriver driver){
        this.driver = driver;
    }



    public void clickSortedBy(){
        driver.findElement(clickSort).click();
    }

    public void clickSortedByDropDownOptionsBy(int index){
        Select dropDown = new Select(driver.findElement(sortBy));
        dropDown.selectByIndex(index);

    }

    public ItemDetails clickItem(int index){
        List<WebElement> samsungTvs = driver.findElements(samsungTvLocator);
        for (int i = 0; i < samsungTvs.size(); i++ ){

            samsungTvs.get(index).click();
            break;
        }
        return new ItemDetails(driver);
    }



}