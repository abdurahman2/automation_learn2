package WebDriver.Bookdepository.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SearchResultsPage {

    private final WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-isbn='9780321356680']")
    private WebElement addToBasketButtonPrice45;

    @FindBy(xpath = " descendant-or-self::*[contains(@content,'java')]")
    private List<WebElement> generalSearchResult;

    @FindBy(xpath = "//*[@data-lazy='https://d1w7fb2mkkr3kw.cloudfront.net/assets/images/book/mid/9780/3213/9780321356680.jpg']")
    private WebElement goToBookDetailPage;

    @FindBy(xpath = "//span[@data-item-count]")
    private WebElement itemCountInBasket;

    @FindBy(xpath = "//div[@class='modal-header']//h3")
    private WebElement modalWindowTitle;

    @FindBy(xpath = "//h1")
    private WebElement bookName;

    public int countGeneralSearchResult() {
        return generalSearchResult.size();
    }

    public ProductPage navigateToBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(addToBasketButtonPrice45));
        addToBasketButtonPrice45.click();
        return new ProductPage(driver);
    }

    public ProductPage openDetailBookPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(goToBookDetailPage));
        goToBookDetailPage.click();
        return new ProductPage(driver);
    }

    public SearchResultsPage addBook45ToBasket() {
        new BookdepositoryHomePage(driver)
                .openPage()
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
