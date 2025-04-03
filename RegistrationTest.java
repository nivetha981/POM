package POM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.page.RegistrationPage;

import java.util.concurrent.TimeUnit;

public class RegistrationTest {
    
    public static void main(String[] args) {
        // Set up WebDriver
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://parabank.parasoft.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Create RegistrationPage object
        RegistrationPage regPage = new RegistrationPage(driver);

        // Click on Register link
        regPage.clickRegisterLink();

        // Fill the Registration Form
        regPage.fillRegistrationForm("Niivv", "M", "123, 7th cross", "HYD", "TN", "6001", "989898898", "855", "abccd", "abccd", "abccd");

        // Click Register Button
        regPage.clickRegisterButton();

        // Verify Success Message
        try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            String message = regPage.getSuccessMessage();
            System.out.println("Success Message: " + message);
        } catch (Exception e) {
            System.out.println("Registration failed!");
        } finally {
            driver.quit();
        }
    }
}
