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

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[2]/li[3]/a")
    private WebElement signInRegisterButton;

    @FindBy(xpath = "/html/body/div[2]/div[1]/div/ul[2]/li[3]/a/i")
    private WebElement icon;

    @FindBy(xpath = "//*[@id=\"book-search-form\"]/div[1]/input[1]")
    private WebElement searchField;

    @FindBy(xpath = "/html/body/div[2]/div[4]/div/ul/li[1]/a[1]")
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

    public BookdepositorySearchResultsPage searchBook(String name) {
        searchField.click();
        searchField.sendKeys("java");
        searchButton.click();
        return new BookdepositorySearchResultsPage(driver);
    }
}

//    WebElement logo = driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/div[2]/div[1]/h1/a"));
//    WebElement signInRegister = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul[2]/li[3]/a"));
//    WebElement icon = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/ul[2]/li[3]/a/i"));
//    WebElement searchField = driver.findElement(By.xpath("//*[@id=\"book-search-form\"]/div[1]/input[1]"));
//    WebElement navigationMenu = driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/ul/li[1]/a[1]"));
//    WebElement banner = driver.findElement(By.xpath("//img[@alt='Books on Screen']"));
//    WebElement searchButton = driver.findElement(By.xpath("//span[@class='text']"));
//    WebElement searchButtonMob = driver.findElement(By.xpath("//button[@aria-label='Search']"));
