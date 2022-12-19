package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "email")
    private WebElement emailField;

    @FindBy(id =  "pass")
    private WebElement passwordField;

    @FindBy(id = "send2")
    private WebElement loginButton;

    public void setEmailField(String value){
        emailField.sendKeys(value);
    }

    public void setPasswordField(String value){
        passwordField.sendKeys(value);
    }

    public void clickLoginButton(){
        loginButton.click();
    }

}

