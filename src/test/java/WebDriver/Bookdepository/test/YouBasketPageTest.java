package WebDriver.Bookdepository.test;

import WebDriver.Bookdepository.page.BookdepositoryHomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouBasketPageTest {
    private WebDriver driver;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open payment page")
    public void openPaymentPage() {
        String pageName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .openYourBasketPage()
                .openYourBasketPage2()
                .goToPaymentPage()
                .getPageName();
        Assert.assertEquals("Payment details", pageName);
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
