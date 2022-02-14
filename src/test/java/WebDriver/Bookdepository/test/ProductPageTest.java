package WebDriver.Bookdepository.test;

import WebDriver.Bookdepository.page.BookdepositoryHomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPageTest {
    private WebDriver driver;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Open detail product page")
    public void openDetailProductPage() {
        String bookName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .getBookTitle();
        Assert.assertEquals("Effective Java", bookName);
    }

    @Test
    @DisplayName("Open your basket page")
    public void openYourBasketPage() {
        String pageName = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .openDetailBookPage()
                .openYourBasketPage()
                .openYourBasketPage2()
                .getTitlePage();
        Assert.assertEquals("Your basket", pageName);
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}
