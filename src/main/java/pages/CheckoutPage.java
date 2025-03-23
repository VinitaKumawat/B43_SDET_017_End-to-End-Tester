package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By proceedToCheckoutButton = By.xpath("//button[contains(text(),'Proceed to checkout')]");

    public void clickProceedToCheckout() {
        driver.findElement(proceedToCheckoutButton).click();
    }

    public String getCurrentPageUrl() {
        return driver.getCurrentUrl();
    }
}
