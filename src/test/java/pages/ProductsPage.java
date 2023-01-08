package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {

    private WebDriver driver;

    public ProductsPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "swatch26")
    private WebElement selectcolor;
    @FindBy(id = "swatch79")
    private  WebElement sizeM;
    @FindBy(css = "button.btn-cart:nth-child(1)")
    private WebElement addToCart;

    public void clickSelectcolor () { selectcolor.click(); }
    public void clickSizeM() { sizeM.click(); }
    public void clickAddToCart() { addToCart.click(); }

}
