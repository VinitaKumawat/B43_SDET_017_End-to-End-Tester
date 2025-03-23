package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Base;

public class CombinationPliersSteps extends Base {
    WebDriver driver;

    @Given("I am on the Combination Pliers product page")
    public void i_am_on_the_combination_pliers_product_page() {
        driver = initializeDriver("chrome");
        driver.get("https://practicesoftwaretesting.com/product/01JQ1E06XT7F9FZYHRCQAQQYP");
        System.out.println("Navigated to the Combination Pliers product page.");
    }

    @When("I add the product to the cart")
    public void i_add_the_product_to_the_cart() {
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        System.out.println("Clicked on Add to cart.");
    }

    @Then("I should see a confirmation message for adding to the cart")
    public void i_should_see_confirmation_message_for_adding_to_cart() {
        boolean isAdded = driver.findElement(By.xpath("//div[contains(text(),'added to your cart')]")).isDisplayed();
        Assert.assertTrue(isAdded, "The product was not added to the cart.");
        System.out.println("Verified that the product was added to the cart.");
    }

    @When("I add the product to favourites")
    public void i_add_the_product_to_favourites() {
        driver.findElement(By.xpath("//button[contains(text(),'Add to favourites')]")).click();
        System.out.println("Clicked on Add to favourites.");
    }

    @Then("I should see a confirmation message for adding to favourites")
    public void i_should_see_confirmation_message_for_adding_to_favourites() {
        boolean isFavourited = driver.findElement(By.xpath("//div[contains(text(),'added to your favourites')]")).isDisplayed();
        Assert.assertTrue(isFavourited, "The product was not added to favourites.");
        System.out.println("Verified that the product was added to favourites.");
    }
}
