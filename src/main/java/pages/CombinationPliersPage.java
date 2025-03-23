package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CombinationPliersPage {
    WebDriver driver;

    public CombinationPliersPage(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    private By addToFavouritesButton = By.xpath("//button[contains(text(),'Add to favourites')]");
    private By cartConfirmationMessage = By.xpath("//div[contains(text(),'added to your cart')]");
    private By favouritesConfirmationMessage = By.xpath("//div[contains(text(),'added to your favourites')]");

    public void addToCart() {
        driver.findElement(addToCartButton).click();
    }

    public void addToFavourites() {
        driver.findElement(addToFavouritesButton).click();
    }

    public boolean isProductAddedToCart() {
        return driver.findElement(cartConfirmationMessage).isDisplayed();
    }

    public boolean isProductAddedToFavourites() {
        return driver.findElement(favouritesConfirmationMessage).isDisplayed();
    }
}
