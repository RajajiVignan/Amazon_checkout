package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {

	public WebDriver driver;//variable of class
	public Homepage(WebDriver driver) { //variable of constructor
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

  
  @FindBy(id="nav-link-accountList")
  WebElement Signin;
  
  //@FindBy(xpath="//input[@type='submit']")
  //WebElement submit;
  
    public WebElement sign()
    {
    	return Signin;
   
    }
   	
	
}
