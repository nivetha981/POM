package POM.base;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.page.Loginpage;
import POM.page.updateProfilePage;

public class Update_profileTest {

	public static void main(String[] args) 
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver2.exe");
	driver=new ChromeDriver();
	driver.get("http://parabank.parasoft.com");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	Loginpage login = new Loginpage(driver);
    login.enterCredentials("nivi@57", "nivi@57");
    login.clickSubmit();
    
    
    updateProfilePage update_profile=new updateProfilePage(driver);
    update_profile.clickInput();
    update_profile.contactInfo("nive", "m", "123 bicycle", "chenn", "HYD", "7897", "789456123");
    update_profile.clickUpdate();
    
    try {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("updateProfileResult")));

        String message = update_profile.Sts(); // Or directly call getText here
        System.out.println("Success Message: " + message);
    } catch (Exception e) {
        System.out.println("Update failed! " + e.getMessage());
    } finally {
        driver.quit();
    }

}
}
