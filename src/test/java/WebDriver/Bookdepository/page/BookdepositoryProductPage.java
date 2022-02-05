package WebDriver.Bookdepository.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookdepositoryProductPage {
    public BookdepositoryProductPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1")
    WebElement bookTitle;

    @FindBy(xpath = "/html/body/div[2]/div[5]/div/div/div[1]/div[1]/div[3]/div/div[2]/div/div[3]/span")
    WebElement bookPrice;

    public String getBookTitle() {
        return bookTitle.getText();
    }

    public String getBookPrice() {
        return bookPrice.getText();
    }
}
