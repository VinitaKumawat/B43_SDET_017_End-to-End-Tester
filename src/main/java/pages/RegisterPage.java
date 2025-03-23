package pages;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Generic method to wait for an element to be visible
    private void waitForVisibility(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    @FindBy(id = "first_name")
    WebElement firstName;

    @FindBy(id = "last_name")
    WebElement lastName;

    @FindBy(id = "dob")
    WebElement dob;

    @FindBy(id = "street")
    WebElement street;

    @FindBy(id = "postal_code")
    WebElement postal_code;

    @FindBy(id = "city")
    WebElement city;

    @FindBy(id = "state")
    WebElement state;

    @FindBy(id = "country")
    WebElement countryDropdown;


    @FindBy(id = "phone")
    WebElement phone;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Register']")
    WebElement registerButton;

    public void enterFirstName(String name) {
        waitForVisibility(firstName);
        firstName.clear();
        firstName.sendKeys(name);
    }

    public void enterLastName(String lname) {
        waitForVisibility(lastName);
        lastName.clear();
        lastName.sendKeys(lname);
    }

    public void enterDOB(String date) {
        waitForVisibility(dob);
        dob.clear();
        dob.sendKeys(date);
    }

    public void enterStreet(String str) {
        waitForVisibility(street);
        street.clear();
        street.sendKeys(str);
    }

    public void enterPostcode(String code) {
        waitForVisibility(postal_code);
        postal_code.clear();
        postal_code.sendKeys(code);
    }

    public void enterCity(String cityName) {
        waitForVisibility(city);
        city.clear();
        city.sendKeys(cityName);
    }

    public void enterState(String stateName) {
        waitForVisibility(state);
        state.clear();
        state.sendKeys(stateName);
    }

    public void selectCountry(String countryName) {
        waitForVisibility(countryDropdown);
        Select select = new Select(countryDropdown);
        select.selectByVisibleText(countryName);
    }

    public void enterPhone(String phoneNumber) {
        waitForVisibility(phone);
        phone.clear();
        phone.sendKeys(phoneNumber);
    }

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

    public void clickRegister() {
        waitForVisibility(registerButton);
        registerButton.click();
    }



}
