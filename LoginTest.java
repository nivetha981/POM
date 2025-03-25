package POM.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.page.Loginpage;

public class LoginTest {
	
	    public static void main(String[] args) {
	    	
		        System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
		        WebDriver driver=new ChromeDriver();
		        driver.get("http://parabank.parasoft.com");
		        driver.manage().window().maximize();
		        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		        
		        Loginpage login=new Loginpage(driver);
		        
		         login.enterCredentials("abccd","abccd");
		         login.clickSubmit();
		         
		         try {
		             WebDriverWait wait = new WebDriverWait(driver, 10);
		             String sts=login.getStatus();
		             System.out.println("Status : "+sts);
		         } 
		         catch(Exception e) {
		                System.out.println("Status : "+e);
		         }
		         finally
		         {
		             driver.quit();
		         }
		}
	}
 

