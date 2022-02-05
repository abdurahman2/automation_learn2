package WebDriver.Bookdepository.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BookdepositorySearchResultsPage {

    public final WebDriver driver;

    public BookdepositorySearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-price='45.34']")
    private WebElement addToBasketButtonPrice45;

    @FindBy(xpath = "//div[@class='main-content search-page']//div[2]//div[1]//a[1]//img[1]")
    private WebElement linkOnProduct9780321356680;

    @FindBy(xpath = " descendant-or-self::*[contains(@content,'java')]")
    private List<WebElement> generalSearchResult;

    @FindBy(xpath = "//span[@data-item-count]")
    private WebElement itemCountInBasket;

    @FindBy(xpath = "//div[@class='modal-header']//h3")
    private WebElement modalWindowTitle;

    public int countGeneralSearchResult() {
        return generalSearchResult.size();
    }

    public BookdepositoryProductPage navigateToBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(linkOnProduct9780321356680));
        linkOnProduct9780321356680.click();
        return new BookdepositoryProductPage(driver);
    }

    public BookdepositorySearchResultsPage addBook45ToBasket() {
        new BookdepositoryHomePage(driver).openPage()
                .searchBook("java")
                .addToBasketButtonPrice45.click();
        return this;
    }

    public String getModalTitle() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(modalWindowTitle));
        return modalWindowTitle.getText();
    }
}
