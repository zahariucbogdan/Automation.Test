package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class BuyNewProduct {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver.exe", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
    }


        @Test
        public void buyNewProduct () throws InterruptedException {

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        CartPage cartPage = new CartPage(driver);
        VipPage vipPage = new VipPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);

        homePage.clickAccountButton();
        homePage.clickLoginLink();
        loginPage.setEmailField("bogdan_black@yahoo.com");
        loginPage.setPasswordField("qwerty");
        loginPage.clickLoginButton();
        accountPage.getWelcomeText();
        homePage.clickVipsection();
        productsPage.clickSelectcolor();
        productsPage.clickSizeM();
        productsPage.clickAddToCart();
        cartPage.setSelectCountry("Romania");
        cartPage.setSelectRegion("Iasi");
        cartPage.setCityname("Iasi");
        cartPage.setpostcode("700460");
        cartPage.clickProceedtochechout();
        checkoutPage.setBillingFirstName("zahariuc");
        checkoutPage.setBillingMiddleName("nicolae");
        checkoutPage.setBillingLastName("bogdan");
        checkoutPage.setBillingStreet("titu maiorescu,nr 10");
        checkoutPage.setBillingCity("Iasi");
        checkoutPage.setBillingCountry_id("Romania");
        checkoutPage.setBillingPostcode("700460");
        checkoutPage.setBillingPhone("0734931189");
        checkoutPage.clickBillingButtonsContinueToShipping();
        Thread.sleep(15000);
        checkoutPage.clickFreeShipping();
        Thread.sleep(5000);
        checkoutPage.clickShippingMethodContinueToPayment();
        Thread.sleep(5000);
        checkoutPage.clickPaymentButtonsContinueToOrderReview();
        Thread.sleep(7000);
        checkoutPage.clickPlaceOrder();

    }
    @After
    public void quit() {
        driver.close();
    }
}
