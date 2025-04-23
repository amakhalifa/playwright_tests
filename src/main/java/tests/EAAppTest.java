package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.EmployeeListPage;
import pages.CreateEmployeePage;

public class EAAppTest {
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();

        // Navigate to EAApp website
        driver.get("http://eaapp.somee.com");

        // Login
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("admin");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();

        // Navigate to Employee List page
        driver.findElement(By.cssSelector("a[href='/Employee']")).click();

        // Click "Create New" button
        EmployeeListPage employeeListPage = new EmployeeListPage(driver);
        employeeListPage.clickCreateNewButton();

        // Enter employee details and submit
        CreateEmployeePage createEmployeePage = new CreateEmployeePage(driver);
        createEmployeePage.enterName("John Doe");
        createEmployeePage.enterSalary("75000");
        createEmployeePage.enterDurationWorked("5");
        createEmployeePage.selectGrade("CLevel");
        createEmployeePage.enterEmail("john.doe@example.com");
        createEmployeePage.clickSubmitButton();

        // Close the browser
        driver.quit();
    }
}
