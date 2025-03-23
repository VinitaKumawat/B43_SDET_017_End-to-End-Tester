package stepDefinition;

import io.cucumber.java.en.*;
import pages.RegisterPage;
import utils.Base;
import org.testng.Assert;

public class RegisterSteps extends Base {
    RegisterPage registerPage;

    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
        driver = initializeDriver("chrome");
        driver.get("https://practicesoftwaretesting.com/auth/register");
        registerPage = new RegisterPage(driver);
        Assert.assertEquals(driver.getTitle(), "Register - Practice Software Testing"); // Verifying page title
    }

    @When("I fill in the registration form with valid details")
    public void i_fill_in_the_registration_form_with_valid_details() {
        registerPage.enterFirstName("John");
        registerPage.enterLastName("Doe");
        registerPage.enterDOB("15-05-1990");
        registerPage.enterStreet("123 Elm Street");
        registerPage.enterPostcode("12345");
        registerPage.enterCity("Springfield");
        registerPage.enterState("Illinois");
        registerPage.selectCountry("United States Minor Outlying Islands (the)");
        registerPage.enterPhone("1234567890");
        registerPage.enterEmail("john.doe@example.com");
        registerPage.enterPassword("Collection@123#");
    }

    @And("I click the register button")
    public void i_click_the_register_button() {
        registerPage.clickRegister();
        System.out.println("Registration button clicked.");
        Base.closeDriver();
    }
}
