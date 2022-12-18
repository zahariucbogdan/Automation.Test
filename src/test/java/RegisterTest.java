import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
    public class RegisterTest {
        private WebDriver driver;
        @Before
        public void initDriver() {
            System.setProperty("webdriver.chrome.driver.exe", "resources/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://testfasttrackit.info/selenium-test/");
        }
        @Test
        public void registerWithValidData() {

            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#firstname")).sendKeys("Zahariuc");
            driver.findElement(By.cssSelector("#middlename")).sendKeys("Nicolae");
            driver.findElement(By.id("lastname")).sendKeys("Bogdan");
            driver.findElement(By.id("email_address")).sendKeys("bogdanzah@yahoo.com");
            driver.findElement(By.id("password")).sendKeys("qwerty");
            driver.findElement(By.id("confirmation")).sendKeys("qwerty");
            driver.findElement(By.cssSelector("button.button:nth-child(2)")).click();
            driver.findElement(By.id("is_subscribed")).click();

        }
        @After
        public void quit() {
            driver.close();
        }
    }

