package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddToCartPage {
    WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    private By confirmationMessage = By.xpath("//*[contains(text(),'added to your cart')]");

    public void clickAddToCart() {
        driver.findElement(addToCartButton).click();
    }

    public boolean isProductAddedToCart() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }
}
