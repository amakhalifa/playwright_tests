package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EmployeeListPage {
    private WebDriver driver;

    // Locators
    private By createNewButton = By.cssSelector("a[href='/Employee/Create']");

    // Constructor
    public EmployeeListPage(WebDriver driver) {
        this.driver = driver;
    }

    // Methods
    public void clickCreateNewButton() {
        driver.findElement(createNewButton).click();
    }
}
