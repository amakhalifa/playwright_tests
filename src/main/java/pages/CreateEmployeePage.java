package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateEmployeePage {
    private WebDriver driver;

    // Locators
    private By nameField = By.id("Name");
    private By salaryField = By.id("Salary");
    private By durationWorkedField = By.id("DurationWorked");
    private By gradeDropdown = By.id("Grade");
    private By emailField = By.id("Email");
    private By submitButton = By.cssSelector("input[type='submit']");

    // Constructor
    public CreateEmployeePage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void enterSalary(String salary) {
        driver.findElement(salaryField).sendKeys(salary);
    }

    public void enterDurationWorked(String durationWorked) {
        driver.findElement(durationWorkedField).sendKeys(durationWorked);
    }

    public void selectGrade(String grade) {
        driver.findElement(gradeDropdown).sendKeys(grade);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }
}
