import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuyNewProduct {
    private WebDriver driver;

    @Before
    public void initDriver() {
        System.setProperty("webdriver.chrome.driver.exe", "resources/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://testfasttrackit.info/selenium-test/");
    }
    @Test
    public void buyProduct() {
        driver.findElement(By.cssSelector(".skip-account .label")).click();
        driver.findElement(By.cssSelector("[title='Log In']")).click();
        driver.findElement(By.id("email")).sendKeys("bz@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("qwerty");
        driver.findElement(By.id("send2")).click();
        driver.findElement(By.cssSelector(".large")).click();

        driver.findElement(By.cssSelector("li.level0:nth-child(6) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("li.item:nth-child(2) > div:nth-child(2) > div:nth-child(4) > a:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#swatch27 > span:nth-child(1) > img:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#swatch65 > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("button.btn-cart:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();

        driver.findElement(By.id("country")).click();
        driver.findElement(By.id("country")).sendKeys("Romania");
        driver.findElement(By.id("region_id")).click();
        driver.findElement(By.cssSelector("#region_id > option:nth-child(26)")).click();
        driver.findElement(By.id("city")).sendKeys("Iasi");
        driver.findElement(By.id("postcode")).sendKeys("700460");
        driver.findElement(By.cssSelector(".method-checkout-cart-methods-onepage-bottom > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#billing-buttons-container")).click();

        //  driver.findElement(By.id("login-guest")).click();
        //  driver.findElement(By.cssSelector("#onepage-guest-register-button > span:nth-child(1) > span:nth-child(1)")).click();
        //  driver.findElement(By.id("billing:firstname")).sendKeys("Bogdan");
        //  driver.findElement(By.id("billing:lastname")).sendKeys("Zahariuc");
        //  driver.findElement(By.id("billing:email")).sendKeys("bogdanzah@yahoo.com");
        //  driver.findElement(By.id("billing:street1")).sendKeys("str Titu Maiorescu");
        //  driver.findElement(By.id("billing:city")).sendKeys("Iasi");
        //  driver.findElement(By.id("#billing\\:region_id > option:nth-child(26)")).click();
        //  driver.findElement(By.id("billing:region_id")).click();
        //  driver.findElement(By.id("billing:region_id")).sendKeys("Iasi");
        //  driver.findElement(By.id("billing:postcode")).sendKeys("700460");
        //  driver.findElement(By.id("billing:country_id")).sendKeys("Romania");
        //  driver.findElement(By.id("billing:telephone")).sendKeys("0040734931189");
        //  driver.findElement(By.id("billing-buttons-container")).click();
        //  driver.findElement(By.id("shippingMethod.save")).click();
        //  driver.findElement(By.id("payment.save")).click();
        //  driver.findElement(By.id(".btn-checkout")).click();
        //  driver.findElement(By.id(".buttons-set button")).click();

        driver.findElement(By.cssSelector("#billing-buttons-container > button:nth-child(1) > span:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector("#s_method_freeshipping_freeshipping")).click();
        driver.findElement(By.cssSelector("#payment-buttons-container > button:nth-child(2) > span:nth-child(1) > span:nth-child(1)")).click();
        driver.findElement(By.cssSelector(".btn-checkout > span:nth-child(1) > span:nth-child(1)")).click();

        WebElement welcomeTextElement = driver.findElement(By.cssSelector(".page-title > h1:nth-child(1)"));
        String expectedText = "Your order has been received.";
        String actualText = welcomeTextElement.getText();
        Assert.assertEquals(expectedText, actualText);
        WebElement myAccount = driver.findElement(By.cssSelector(".sub-title"));
        Assert.assertTrue(myAccount.isDisplayed());
    }


}
