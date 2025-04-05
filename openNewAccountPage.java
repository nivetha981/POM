package POM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class openNewAccountPage {
	WebDriver driver;
    By newAC=By.xpath("//a[normalize-space()='Open New Account']");
    By select= By.xpath("//option[@value='0']");
    By fromAccountId=By.xpath("//select[@id='fromAccountId']");
    By createButton= By.xpath("//input[@value=\"Open New Account\"]");
    By sts=(By.xpath("//p[text()='Congratulations, your account is now open.']"));
    
 
    public openNewAccountPage(WebDriver driver) {
		this.driver = driver;	
		}
	
	public void ClickCreatAC()
	{
	    driver.findElement(newAC).click();
	}
	public void selectType()
	{
	    driver.findElement(select).click();
	}
     public void fromAccountId()
	{
	    driver.findElement(fromAccountId).click();
	}
	public void createButton()
	{
	    driver.findElement(createButton).click();
	}
	public String Sts()
			{
			    WebElement s=driver.findElement(sts);
			    return s.getText();  
			}
			
	

}
