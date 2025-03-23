package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.Base;

public class AddToCartSteps extends Base {
    WebDriver driver;

    @Given("I am on the Combination Pliers product page")
    public void i_am_on_the_combination_pliers_product_page() {
        driver = initializeDriver("chrome");
        driver.get("https://practicesoftwaretesting.com/product/01JQ1E06XT7F9FZYHRCQAQQYP");
        System.out.println("Navigated to the Combination Pliers product page.");
    }

    @When("I click on \"Add to cart\"")
    public void i_click_on_add_to_cart() {
        driver.findElement(By.xpath("//button[contains(text(),'Add to cart')]")).click();
        System.out.println("Clicked on Add to Cart button.");
    }

    @Then("the product should be added to the cart successfully")
    public void the_product_should_be_added_to_the_cart_successfully() {
        boolean isProductAdded = driver.findElement(By.xpath("//*[contains(text(),'added to your cart')]")).isDisplayed();
        Assert.assertTrue(isProductAdded, "The product was not added to the cart.");
        System.out.println("Verified that the product was added to the cart successfully.");
    }
}
