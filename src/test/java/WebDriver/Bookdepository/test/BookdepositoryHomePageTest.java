package WebDriver.Bookdepository.test;

import WebDriver.Bookdepository.page.BookdepositoryHomePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookdepositoryHomePageTest {

    private WebDriver driver;

    @Before
    public void browserSetup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    @DisplayName("Element is present on main page")
    public void signInRegisterButtonIsVisible() {
        boolean signInRegisterButtonIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentSignInRegister();
        Assert.assertTrue(signInRegisterButtonIsVisible);
    }

    @Test
    public void iconIsVisible() {
        boolean iconIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentIcon();
        Assert.assertTrue(iconIsVisible);
    }

    @Test
    public void searchFieldIsVisible() {
        boolean searchFieldIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentSearchField();
        Assert.assertTrue(searchFieldIsVisible);
    }

    @Test
    public void navigationMenuIsVisible() {
        boolean navigationMenuIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentNavigationMenu();
        Assert.assertTrue(navigationMenuIsVisible);
    }

    @Test
    public void bannerIsVisible() {
        boolean bannerIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentNavigationMenu();
        Assert.assertTrue(bannerIsVisible);
    }

    @Test
    public void searchButtonIsVisible() {
        boolean searchButtonIsVisible = new BookdepositoryHomePage(driver)
                .openPage()
                .presentNavigationMenu();
        Assert.assertTrue(searchButtonIsVisible);
    }

    @Test
    @DisplayName("Search book")
    public void searchBook() {
        int expectedSearchResultNumber = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .countGeneralSearchResult();
        Assert.assertTrue("Book with a title containing the search phrase is not present", expectedSearchResultNumber > 0);
    }

    @Test
    @DisplayName("Check logo name")
    public void checkLogoName() {
        String logoName = new BookdepositoryHomePage(driver)
                .openPage()
                .getLogoName();
        Assert.assertEquals(logoName, "Bookdepository.com");
    }

    @After
    public void browserClose() {
        driver.quit();
        driver = null;
    }
}

