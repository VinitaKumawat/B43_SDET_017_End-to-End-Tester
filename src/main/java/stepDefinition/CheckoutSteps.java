package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Base;

public class CheckoutSteps extends Base {
    WebDriver driver;

    @Given("I am on the cart page with Combination Pliers added")
    public void i_am_on_the_cart_page_with_combination_pliers_added() {
        driver = initializeDriver("chrome");
        driver.get("https://practicesoftwaretesting.com/checkout");
        System.out.println("Navigated to the cart page.");
    }

    @When("I click on \"Proceed to checkout\"")
    public void i_click_on_proceed_to_checkout() {
        driver.findElement(By.xpath("//button[contains(text(),'Proceed to checkout')]")).click();
        System.out.println("Clicked on Proceed to Checkout button.");
    }

    @Then("I should be redirected to the checkout page")
    public void i_should_be_redirected_to_the_checkout_page() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("checkout"), "Redirection to checkout page failed.");
        System.out.println("Successfully redirected to the checkout page.");
    }
}
