package WebDriver.Bookdepository.test;

import WebDriver.Bookdepository.page.BookdepositoryHomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultsPageTest {

    private WebDriver driver;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Product page with need book is opened")
    public void productPageIsOpened() {
        String bookTitle = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .navigateToBookPage()
                .getBookTitle();
        System.out.println(bookTitle);
        Assert.assertEquals("Effective Java", bookTitle);
    }

    @Test
    @DisplayName("Book is added ti the basket")
    public void bookIsAddedToTheBasket() {
        String modalWindowTitle = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .addBook45ToBasket()
                .getModalTitle();
        Assert.assertEquals("Item added to your basket", modalWindowTitle);
    }

    @After
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}

