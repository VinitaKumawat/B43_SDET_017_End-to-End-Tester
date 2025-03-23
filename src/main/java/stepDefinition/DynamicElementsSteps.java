package stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import utils.Base;

public class DynamicElementsSteps extends Base {
    WebDriver driver;
    HomePage homePage;

    @Before
    public void setUp() {
        // Specify the browser (e.g., "chrome")
        driver = initializeDriver("chrome");
        if (driver == null) {
            throw new RuntimeException("Driver initialization failed!");
        }
        homePage = new HomePage(driver);
        System.out.println("Setup completed successfully.");
    }

    @After
    public void tearDown() {
        closeDriver();
        System.out.println("Teardown completed successfully.");
    }

    @Given("I am on the ToolShop home page")
    public void i_am_on_the_toolshop_home_page() {
        driver.get("https://practicesoftwaretesting.com");
        System.out.println("Navigated to the ToolShop home page.");
    }

    @When("I change the language to {string}")
    public void i_change_the_language(String language) {
        homePage.changeLanguage(language);
        System.out.println("Changed language to: " + language);
    }

    @Then("The website language should change to {string}")
    public void the_website_language_should_change_to(String language) {
        boolean result = homePage.isLanguageChanged(language);
        Assert.assertTrue(result, "Language did not change to " + language);
        System.out.println("Verified that the language changed to: " + language);
    }

    @When("I select a category {string}")
    public void i_select_a_category(String category) {
        homePage.selectCategory(category);
        System.out.println("Selected category: " + category);
    }

    @Then("The products should be filtered by the selected category {string}")
    public void the_products_should_be_filtered_by_the_selected_category(String category) {
        boolean result = homePage.isCategoryFiltered(category);
        Assert.assertTrue(result, "Products are not filtered by the selected category: " + category);
        System.out.println("Verified that products are filtered by category: " + category);
    }

    @When("I select sort option {string}")
    public void i_select_sort_option(String option) {
        homePage.selectSortOption(option);
        System.out.println("Selected sort option: " + option);
    }

    @Then("The products should be sorted by the selected option {string}")
    public void the_products_should_be_sorted_by_the_selected_option(String option) {
        boolean result = homePage.isProductsSorted(option);
        Assert.assertTrue(result, "Products are not sorted by the selected option: " + option);
        System.out.println("Verified that products are sorted by: " + option);
    }
}
