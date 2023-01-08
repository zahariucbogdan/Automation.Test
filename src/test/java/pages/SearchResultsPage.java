package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = ".product-name a")
    private List<WebElement> listOfResults;

    public boolean isProductInList(String productName){
        for (WebElement element : listOfResults){
            if (element.getText().equalsIgnoreCase(productName)){
                return true;
            }
        }
        return false;
    }
}
