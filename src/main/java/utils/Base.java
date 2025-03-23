package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class Base {
    protected static WebDriver driver;

    public static WebDriver initializeDriver(String browser) {
        if (driver == null) {
            try {
                switch (browser.toLowerCase()) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        System.out.println("Chrome browser launched successfully.");
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driver = new FirefoxDriver();
                        System.out.println("Firefox browser launched successfully.");
                        break;

                    case "edge":
                        WebDriverManager.edgedriver().setup();
                        driver = new EdgeDriver();
                        System.out.println("Edge browser launched successfully.");
                        break;

                    default:
                        throw new IllegalArgumentException("Browser not supported: " + browser);
                }

                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            } catch (Exception e) {
                System.err.println("Error initializing driver: " + e.getMessage());
            }
        }
        return driver;
    }

    public static void closeDriver() {
        try {
            if (driver != null) {
                driver.quit();
                driver = null;
                System.out.println("Browser closed successfully.");
            }
        } catch (Exception e) {
            System.err.println("Error closing driver: " + e.getMessage());
        }
    }
}
