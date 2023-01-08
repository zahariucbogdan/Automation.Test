package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchResultsPage;

public class SearchTest {

        private WebDriver driver;

        @Before
        public void initDriver() {
                System.setProperty("webdriver.chrome.driver.exe", "resources/chromedriver");
                driver = new ChromeDriver();

                driver.manage().window().maximize();
                driver.get("http://testfasttrackit.info/selenium-test/");
        }

        @Test
        public void searchByKeywordTest() throws InterruptedException {
                HomePage homePage = new HomePage(driver);
                SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

                homePage.setSearchField("neck");
                Assert.assertTrue(searchResultsPage.isProductInList("SILVER DESERT NECKLACE"));
                Thread.sleep(2000);
                homePage.setSearchField("shirt");
                Assert.assertTrue(searchResultsPage.isProductInList("FRENCH CUFF COTTON TWILL OXFORD"));
                homePage.setSearchField("shirt");
                Assert.assertFalse(searchResultsPage.isProductInList("SILVER DESERT NECKLACE"));

        }

        @After
        public void quit() {
                driver.close();
        }
}