package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;


    public class WishlistTest {
        private WebDriver driver;

        @Before
        public void initDriver(){
            System.setProperty("webdriver.chrome.driver.exe", "resources/chromedriver");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.get("http://testfasttrackit.info/selenium-test/");
        }

        @Test
        public void addToWishlistTest(){

            HomePage homePage = new HomePage(driver);
            LoginPage loginPage = new LoginPage(driver);
            AccountPage accountPage = new AccountPage(driver);

            homePage.clickAccountButton();
            homePage.clickLoginLink();
            loginPage.setEmailField("zahariucbogdan@yahoo.com");
            loginPage.setPasswordField("qwerty");
            loginPage.clickLoginButton();




        }
        @After
        public void quit(){
            driver.close();
        }

    }
