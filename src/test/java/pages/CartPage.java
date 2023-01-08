package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
        @FindBy (id = "country")
    private WebElement selectcountry;
        @FindBy (id = "region_id")
    private WebElement selectregion;
        @FindBy (id = "city")
    private  WebElement cityname;
        @FindBy (id = "postcode")
    private  WebElement postcode;
        @FindBy (css = ".method-checkout-cart-methods-onepage-bottom > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)");
    private  WebElement proceedtochechout;

    public void setSelectCountry(String value){
        selectcountry.sendKeys(value);}
    public void setSelectRegion(String value){ selectregion.sendKeys(value);}
    public void setCityname(String value){ cityname.sendKeys(value);}
    public void setpostcode(String value){ postcode.sendKeys(value);}
    public void clickProceedtochechout(){ proceedtochechout.click(); }
}