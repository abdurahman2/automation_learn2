package WebDriver.Bookdepository.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductPage {
    private final WebDriver driver;

    public ProductPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    WebElement bookName;

    @FindBy(xpath = "/html/body/div[2]/div[5]/div/div/div[1]/div[1]/div[3]/div/div[2]/div/div[3]/span")
    WebElement bookPrice;

    @FindBy(xpath = "/html/body/div[2]/div[5]/div/div/div[1]/div[1]/div[3]/div/div[3]/a[1]")
    private WebElement addBookToBasketButton;

    //Одинаково, когда что нужно использовать
    public void moveToYourBasketPage() {
        addBookToBasketButton.click();
    }

    public YourBasketPage openYourBasketPage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(addBookToBasketButton));
        addBookToBasketButton.click();
        return new YourBasketPage(driver);
    }

    //Одинаково, когда что нужно использовать
    public String getBookTitle() {
        return bookName.getText();
    }

    public String getTitlePage() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(bookName));
        return bookName.getText();
    }
}
