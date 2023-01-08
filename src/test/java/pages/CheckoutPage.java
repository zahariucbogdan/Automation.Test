package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.swing.text.html.CSS;

public class CheckoutPage {

        private WebDriver driver;

        public CheckoutPage(WebDriver driver){
            this.driver = driver;
            PageFactory.initElements(driver,this);
        }

        @FindBy (id= "billing:firstname")
    private WebElement billingFirstName;
        @FindBy (id = "billing:middlename")
    private  WebElement billingMiddleName;
        @FindBy (id = "billing:lastname")
    private  WebElement billingLastName;
        @FindBy (id = "billing:street1")
    private WebElement billingStreet;
        @FindBy (id = "billing:city")
    private  WebElement billingCity;
        @FindBy ( id = "billing:country_id")
    private WebElement billingCountry_id;
        @FindBy (id = "billing:postcode")
    private WebElement billingPostcode;
        @FindBy (id = "billing:telephone")
    private WebElement billingPhone;
        @FindBy (id = "billing-buttons-container")
    private WebElement billingButtonsContinueToShipping;
        @FindBy (id = "s_method_freeshipping_freeshipping")
    private WebElement selectFreeShipping;
        @FindBy (id = "shipping-method-buttons-container")
    private WebElement shippingMethodContinueToPayment;

        @FindBy (id = "payment-buttons-container")
    private WebElement paymentButtonsContinueToOrderReview;
         @FindBy (id="review-buttons-container")
    private WebElement placeOrder;

        public void setBillingFirstName(String value){ billingFirstName.sendKeys(value);}
        public void setBillingMiddleName(String value){ billingMiddleName.sendKeys(value);}
        public void setBillingLastName(String value){ billingLastName.sendKeys(value);}
        public void setBillingStreet(String value){ billingStreet.sendKeys(value);}
        public void setBillingCity(String value){ billingCity.sendKeys(value);}
        public void setBillingCountry_id(String value){ billingCountry_id.sendKeys(value);}
        public void setBillingPostcode(String value){ billingPostcode.sendKeys(value);}
        public void setBillingPhone(String value){ billingPhone.sendKeys(value);}
        public void clickBillingButtonsContinueToShipping(){ billingButtonsContinueToShipping.click(); }
         // Thread.sleep(15000);
        public void clickFreeShipping(){ selectFreeShipping.click();}
    // Thread.sleep(5000);
        public void clickShippingMethodContinueToPayment(){ shippingMethodContinueToPayment.click();}
        // Thread.sleep(5000);
        public void clickPaymentButtonsContinueToOrderReview(){ paymentButtonsContinueToOrderReview.click();}
        // Thread.sleep(7000);
        public void clickPlaceOrder(){ placeOrder.click();}
    }