package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.plugin.event.HookType;

public class ContactSteps {

    WebDriver driver;
    WebDriverWait wait;

    public ContactSteps() {
    	driver = Hooks.getDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Given("I am on the contact page")
    public void i_am_on_the_contact_page() {
        driver.get("https://practicesoftwaretesting.com/contact");
    }

    @When("I enter my first name as {string}")
    public void i_enter_my_first_name_as(String firstName) {
        driver.findElement(By.id("firstName")).sendKeys(firstName);
    }

    @When("I enter my last name as {string}")
    public void i_enter_my_last_name_as(String lastName) {
        driver.findElement(By.id("lastName")).sendKeys(lastName);
    }

    @When("I enter my email as {string}")
    public void i_enter_my_email_as(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    @When("I leave the email field empty")
    public void i_leave_the_email_field_empty() {
        driver.findElement(By.id("email")).clear();
    }

    @When("I enter the subject as {string}")
    public void i_enter_the_subject_as(String subject) {
        driver.findElement(By.id("subject")).sendKeys(subject);
    }

    @When("I enter the message as {string}")
    public void i_enter_the_message_as(String message) {
        driver.findElement(By.id("message")).sendKeys(message);
    }

    @When("I click the submit button")
    public void i_click_the_submit_button() {
        driver.findElement(By.id("submit")).click();
    }

    @Then("I should see a success message indicating that my message was sent successfully and I will be contacted shortly.")
    public void i_should_see_success_message() {
        WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("successMessage")));
        String actualMessage = successMessage.getText();
        String expectedMessage = "Your message was sent successfully!";
        Assert.assertEquals(actualMessage, expectedMessage, "Success message mismatch!");
    }

    @Then("I should see an error message indicating that the email field is mandatory and must be filled in before submission.")
    public void i_should_see_error_message() {
        WebElement errorMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("emailError")));
        String actualMessage = errorMessage.getText();
        String expectedMessage = "Email is required.";
        Assert.assertEquals(actualMessage, expectedMessage, "Error message mismatch!");
    }
}
