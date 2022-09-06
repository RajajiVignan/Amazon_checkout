package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Signinpage1 {

	public WebDriver driver;
	public Signinpage1(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ap_email")
	WebElement username;

	@FindBy(id="continue")
	WebElement go;
	
   
   
   public WebElement  Emailid()
   {
	   return username;
   }
   
   public WebElement submit()
   {
	   return go;
   }
   
	
	
}
