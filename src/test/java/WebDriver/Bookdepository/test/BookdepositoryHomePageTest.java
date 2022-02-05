package WebDriver.Bookdepository.test;

import WebDriver.Bookdepository.page.BookdepositoryHomePage;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BookdepositoryHomePageTest {

    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
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
    @DisplayName("Search book")
    public void searchBook() {
        int expectedSearchResultNumber = new BookdepositoryHomePage(driver)
                .openPage()
                .searchBook("java")
                .countGeneralSearchResult();
        Assert.assertTrue(expectedSearchResultNumber > 0, "Book with a title containing the search phrase is not present");
    }

    @AfterMethod(alwaysRun = true)
    public void browserClose() {
        driver.quit();
        driver = null;
    }
}


//        searchField.click();
//        searchField.sendKeys("java");
//        searchButtonMob.click();
//        addToCartButton.click();
//        bookItem.click();


//        Assert.assertTrue(logo.isDisplayed(), "Logo is empty");
//        Assert.assertTrue(signInRegister.isDisplayed(), "SignInRegister is empty");
//        Assert.assertTrue(icon.isDisplayed(), "Icon is empty");
//        Assert.assertTrue(searchField.isDisplayed(), "SearchField is empty");
//        Assert.assertTrue(navigationMenu.isDisplayed(), "NavigationMenu is empty");
//        Assert.assertTrue(banner.isDisplayed(), "Banner is empty");
//        Assert.assertTrue(searchButton.isEnabled(), "SearchButton is empty");
//        Assert.assertTrue(searchButtonMob.isDisplayed(), "SearchButtonMob is empty");

