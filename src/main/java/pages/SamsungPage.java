package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class SamsungPage {

    WebDriver driver;
    private  By samsungTvLocator =By.xpath("//div[@class='a-section a-spacing-base']");
    private List<WebElement> samsungTvs = driver.findElements(samsungTvLocator);
    private By sortBy = By.xpath("(//span[@id='a-autoid-23-announce'])[1]");

    SamsungPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSortedBy(){
        driver.findElement(sortBy).click();
    }

    public void clickSortedByDropDownOptionsBy(int index){
        clickSortedBy();
        Select dropDown = new Select(driver.findElement(sortBy));
        dropDown.selectByIndex(index);
    }

    public ItemDetails clickItem(int index){
        for (int i = 0; i < samsungTvs.size(); i++ ){
            samsungTvs.get(index).click();
        }
        return new ItemDetails(driver);
    }

    }









}
//    WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//    Select dropdown = new Select(staticDropdown);
//        dropdown.selectByIndex(3);
//                String selectedDropdownText = dropdown.getFirstSelectedOption().getText();
//                System.out.println(selectedDropdownText);
//                dropdown.selectByVisibleText("AED");