package POM.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class updateProfilePage {
	WebDriver driver;

	By Update_Contact_Info = By.xpath("//a[normalize-space()='Update Contact Info']");
	By Input=By.xpath("//value[@class='input']");
	By fname=By.id("customer.firstName");
	By lname=By.id("customer.lastName");
	By address=By.id("customer.address.street");
	By city=By.id("customer.address.city");
	By state=By.id("customer.address.state");
	By ZipCode=By.id("customer.address.zipCode");
	By Phone=By.id("customer.phoneNumber");

	By submit = By.xpath("//input[@value='Update Profile']");
	By result = By.id("updateProfileResult");
	By header = By.tagName("h1");
	By paragraph = By.xpath("./p[1]");

	public updateProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickInput() {
        driver.findElement(Update_Contact_Info).click();
    }
	public void contactInfo(String name, String lastname, String add, String c_city, String c_state, String c_ZipCode, String c_Phone )
	{
    driver.findElement(Update_Contact_Info).click();
   
    driver.findElement(fname).clear();
	driver.findElement(fname).sendKeys(name);

	driver.findElement(lname).clear();
	driver.findElement(lname).sendKeys(lastname);

	driver.findElement(address).clear();
	driver.findElement(address).sendKeys(add);

	driver.findElement(city).clear();
	driver.findElement(city).sendKeys(c_city);

	driver.findElement(state).clear();
	driver.findElement(state).sendKeys(c_state);

	driver.findElement(ZipCode).clear();
	driver.findElement(ZipCode).sendKeys(c_ZipCode);

	driver.findElement(Phone).clear();
	driver.findElement(Phone).sendKeys(c_Phone);
    }
	public void clickUpdate()
	{
		driver.findElement(submit).click();
	}
	public String Sts() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(result));
	    return driver.findElement(result).getText();
	}


}
