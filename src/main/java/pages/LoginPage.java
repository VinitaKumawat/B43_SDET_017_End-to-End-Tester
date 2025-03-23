package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement loginButton;

    @FindBy(xpath = "//div[contains(text(),'Login failed') or contains(@class, 'alert-danger')]")
    WebElement errorMessage;

    public void enterEmail(String emailAddress) {
        waitForVisibility(email);
        email.clear();
        email.sendKeys(emailAddress);
    }

    public void enterPassword(String pwd) {
        waitForVisibility(password);
        password.clear();
        password.sendKeys(pwd);
    }

    public void clickLogin() {
        waitForVisibility(loginButton);
        loginButton.click();
    }

    public boolean isErrorMessageDisplayed() {
        waitForVisibility(errorMessage);
        return errorMessage.isDisplayed();
    }
}
