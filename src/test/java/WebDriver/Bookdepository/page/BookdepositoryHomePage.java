package WebDriver.Bookdepository.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BookdepositoryHomePage {
    private final static String HOMEPAGE_URL = "https://www.bookdepository.com/";
    private final WebDriver driver;

    public BookdepositoryHomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public BookdepositoryHomePage openPage() {
        driver.get(HOMEPAGE_URL);
        new WebDriverWait(driver, Duration.ofSeconds(100));
        return this;
    }

    @FindBy(xpath = "//img[@alt='Bookdepository.com']")
    private WebElement logo;

    @FindBy(xpath = "//*[@class='icon-user']")
    private WebElement signInRegisterButton;

    @FindBy(xpath = "//*[@class='home-icon-link']")
    private WebElement icon;

    @FindBy(xpath = "//*[@name='searchTerm']")
    private WebElement searchField;

    @FindBy(xpath = "//*[@class='page-links mobile-nav-content']")
    private WebElement navigationMenu;

    @FindBy(xpath = "//img[@alt='Books on Screen']")
    private WebElement banner;

    @FindBy(xpath = "//span[@class='text']")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@aria-label='Search']")
    private WebElement searchButtonMob;

    public Boolean presentLogo() {
        openPage();
        return logo.isDisplayed();
    }

    public Boolean presentSignInRegister() {
        openPage();
        return signInRegisterButton.isDisplayed();
    }

    public Boolean presentIcon() {
        openPage();
        return icon.isDisplayed();
    }

    public Boolean presentSearchField() {
        openPage();
        return searchField.isDisplayed();
    }

    public Boolean presentNavigationMenu() {
        openPage();
        return navigationMenu.isDisplayed();
    }

    public Boolean presentBanner() {
        openPage();
        return banner.isDisplayed();
    }

    public Boolean presentSearchButton() {
        openPage();
        return searchButton.isDisplayed();
    }

    public SearchResultsPage searchBook(String name) {
        searchField.click();
        searchField.sendKeys("java");
        searchButton.click();
        return new SearchResultsPage(driver);
    }

    public String getLogoName(){
        openPage();
        return logo.getAccessibleName();
    }
}
