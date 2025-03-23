package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    private static WebDriver driver;

    @Before
    public void setUp() {
        if (driver == null) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            System.out.println("Browser launched successfully.");
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;  // Resetting the driver to null after quitting
            System.out.println("Browser closed successfully.");
        }
    }
}
