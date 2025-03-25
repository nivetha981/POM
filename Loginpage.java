package POM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class Loginpage {
		WebDriver driver;
		By txt_username = By.xpath("//input[@name='username' and @class='input']");
		By txt_password = By.xpath("//input[@name='password' and @class='input']");
		By btn_submit = By.xpath("//input[@value='Log In' and @type='submit']");
		By Status = By.xpath("//b[normalize-space()='Welcome']");

		
		public Loginpage(WebDriver driver) {
			this.driver = driver;	
			}

		public void enterCredentials(String name, String password) {
			driver.findElement(txt_username).sendKeys(name);
			driver.findElement(txt_password).sendKeys(password);
			
		}
		public void clickSubmit() {
			driver.findElement(btn_submit).click();
		}

		public String getStatus() {
			WebElement statusElement = driver.findElement(Status);
			return statusElement.getText();

		
		}

	}


