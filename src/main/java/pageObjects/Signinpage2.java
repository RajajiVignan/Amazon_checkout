package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Signinpage2 {




	public WebDriver driver;
	
	By password = By.id("ap_password");
	
	By submit = By.id("signInSubmit");
	
	public Signinpage2(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
 
	
	//@FindBy(id="ap_password")
	//WebElement password;
	
	//@FindBy(id="signInSubmit")
	//WebElement submit;
	
	
	public WebElement pass()
	{
		return driver.findElement(password);
	}
	
	public WebElement submit2()
	{
		return driver.findElement(submit);
	}
	
	
	
}
