package stepDefinition;

import static org.testng.AssertJUnit.assertTrue;
import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.BaseClass;

public class LoginSteps extends BaseClass {
    LoginPage loginPage;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        initializeDriver();
        driver.get("https://practicesoftwaretesting.com/auth/login");
        loginPage = new LoginPage(driver);
    }

    @When("I enter valid login credentials")
    public void i_enter_valid_login_credentials() {
        loginPage.enterEmail("john.doe@example.com");
        loginPage.enterPassword("Collection@123#");
    }

    @When("I enter invalid login credentials")
    public void i_enter_invalid_login_credentials() {
        loginPage.enterEmail("johndoe@example.com");
        loginPage.enterPassword("collection1234");
    }

    @And("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should see an error message indicating login failure")
    public void i_should_see_an_error_message_indicating_login_failure() {
        assertTrue("Error message not displayed", loginPage.isErrorMessageDisplayed());
        System.out.println("Login failed with invalid credentials!");
        quitDriver();
    }
}
