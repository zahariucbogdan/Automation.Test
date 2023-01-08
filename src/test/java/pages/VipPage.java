package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VipPage {
    private WebDriver driver;

    public VipPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(id = "product-collection-image-427")
    private  WebElement selectproduct;
    public void setSelectproduct(String value){
            selectproduct.click();}

}
