package POM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.page.Loginpage;
import POM.page.openNewAccountPage;

public class openNewAccountTest {

	public static void main(String[] args) {
		WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Loginpage login = new Loginpage(driver);
        login.enterCredentials("abccd", "abccd");
        login.clickSubmit();
	    
		openNewAccountPage OpenNaC=new openNewAccountPage(driver);
		
	    OpenNaC.ClickCreatAC();
	    OpenNaC.selectType();
	    OpenNaC.fromAccountId();
	    OpenNaC.createButton();
	    OpenNaC.Sts();
	    try {
            WebDriverWait wait = new WebDriverWait(driver, 10);
            String message = OpenNaC.Sts();
            System.out.println("Success Message: " + message);
        } catch (Exception e) {
            System.out.println("Registration failed!");
        } finally {
            driver.quit();
        }
		}

}

