package POM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    
    WebDriver driver;

    // Locators
    By registerLink = By.xpath("//a[normalize-space()='Register']");
    By firstName = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.address.state");
    By zipCode = By.id("customer.address.zipCode");
    By phoneNumber = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.xpath("//input[@name='customer.username']");
    By password = By.xpath("//input[@name='customer.password']");
    By confirmPassword = By.xpath("//input[@id='repeatedPassword']");
    By registerButton = By.xpath("//input[@value='Register']");
    By successMessage = By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]");

    // Constructor
    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    // Click on Register link
    public void clickRegisterLink() {
        driver.findElement(registerLink).click();
    }

    // Fill Registration Form
    public void fillRegistrationForm(String fName, String lName, String addr, String cityName, String stateName, String zip, 
                                     String phone, String ssnNum, String user, String pass, String confirmPass) {
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(address).sendKeys(addr);
        driver.findElement(city).sendKeys(cityName);
        driver.findElement(state).sendKeys(stateName);
        driver.findElement(zipCode).sendKeys(zip);
        driver.findElement(phoneNumber).sendKeys(phone);
        driver.findElement(ssn).sendKeys(ssnNum);
        driver.findElement(username).sendKeys(user);
        driver.findElement(password).sendKeys(pass);
        driver.findElement(confirmPassword).sendKeys(confirmPass);
    }

    // Click Register Button
    public void clickRegisterButton() {
        driver.findElement(registerButton).click();
    }

    // Get Success Message
    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
