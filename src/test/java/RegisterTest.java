import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

    public class RegisterTest {

        public void registerWithValidData(){
            System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("http://testfasttrackit.info/selenium-test/");

            driver.findElement(By.cssSelector("#header > div > div.skip-links > div > a > span.label")).click();
            driver.findElement(By.cssSelector("div.links:nth-child(1) > ul:nth-child(1) > li:nth-child(5) > a:nth-child(1)")).click();
            driver.findElement(By.cssSelector("#firstname")).sendKeys("Zahariuc");
            driver.findElement(By.cssSelector("#middlename")).sendKeys("Nicolae");
            driver.findElement(By.id("lastname")).sendKeys("Bogdan");
            driver.findElement(By.id("email_address")).sendKeys("bz@yahoo.com");
            driver.findElement(By.id("password")).sendKeys("1234567");
            driver.findElement(By.id("confirmation")).sendKeys("1234567");
            driver.findElement(By.cssSelector("button.button:nth-child(2)")).click();
            driver.findElement(By.id("is_subscribed")).click();

            WebElement welcomeTextElement = driver.findElement(By.cssSelector("body > div > div.page > div.main-container.col2-left-layout > div > div.col-main > div.my-account > div > ul > li > ul > li > span"));

            String expectedText = "Hello, Zahariuc Nicolae Bogdan!";
            String actualText = welcomeTextElement.getText();

            if (actualText.equals(expectedText)){
                System.out.println("S-a inregistrat cu success!");
            }else
                System.err.println("Nu s-a inregistrat. ");

            driver.close();

        }


    }

