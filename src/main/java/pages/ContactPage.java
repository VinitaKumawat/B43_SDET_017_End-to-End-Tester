package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactPage {
    WebDriver driver;

    public ContactPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameField = By.cssSelector("#first_name");
    private By lastNameField = By.cssSelector("#last_name");
    private By emailField = By.id("email");
    private By subjectField = By.id("subject");
    private By messageField = By.xpath("//textarea[@id='message']");
    private By submitButton = By.xpath("//input[@value='Send']");
    private By successMessage = By.xpath("//div[@role='alert']");
    private By errorMessage = By.xpath("//div[@id='subject_alert']");

    public void enterName(String firstName) {
        driver.findElement(nameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterSubject(String subject) {
        driver.findElement(subjectField).sendKeys(subject);
    }

    public void enterMessage(String message) {
        driver.findElement(messageField).sendKeys(message);
    }

    public void clearEmail() {
        driver.findElement(emailField).clear();
    }

    public void clickSubmit() {
        driver.findElement(submitButton).click();
    }

    public boolean isSuccessMessageDisplayed() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isErrorMessageDisplayed(String string) {
        return driver.findElement(errorMessage).isDisplayed();
    }

	public Object getEmailField() {
		// TODO Auto-generated method stub
		return null;
	}

	public void clearField(Object emailField2) {
		// TODO Auto-generated method stub
		
	}
}
