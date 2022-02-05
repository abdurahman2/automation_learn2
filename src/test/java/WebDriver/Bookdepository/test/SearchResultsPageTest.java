package WebDriver.Bookdepository.test;

import WebDriver.Bookdepository.page.BookdepositoryHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchResultsPageTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
//    @DisplayName("Product page with need book is opened")
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
    public void bookIsAddedToTheBasket() {
        String modalWindowTitle = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .addBook45ToBasket()
                .getModalTitle();
        Assert.assertEquals("Item added to your basket", modalWindowTitle);
    }

    @AfterMethod
    public void browserTearDown() {
        driver.quit();
        driver = null;
    }
}

