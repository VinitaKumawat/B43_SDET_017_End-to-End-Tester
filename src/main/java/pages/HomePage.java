package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeLanguage(String language) {
        driver.findElement(By.id("language-selector")).click();
        driver.findElement(By.xpath("//li[text()='" + language + "']")).click();
    }

    public boolean isLanguageChanged(String language) {
        String currentLanguage = driver.findElement(By.id("current-language")).getText();
        return currentLanguage.equalsIgnoreCase(language);
    }

    public void selectCategory(String category) {
        driver.findElement(By.xpath("//a[text()='" + category + "']")).click();
    }

    public boolean isCategoryFiltered(String category) {
        return driver.findElements(By.xpath("//h2[contains(text(), '" + category + "')]")).size() > 0;
    }

    public void selectSortOption(String option) {
        driver.findElement(By.id("sort-dropdown")).click();
        driver.findElement(By.xpath("//option[text()='" + option + "']")).click();
    }

    public boolean isProductsSorted(String option) {
        // Implement sorting verification logic based on the selected option.
        return true; // Placeholder
    }
}
