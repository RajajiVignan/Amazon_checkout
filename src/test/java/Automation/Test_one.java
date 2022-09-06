package Automation;

import java.io.IOException;

//import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.Homepage;
import pageObjects.Signinpage1;
import pageObjects.Signinpage2;
import resources.base;

public class Test_one extends base{

	base base;// test one has base
	@Test
	public void basePageNavigation() throws IOException
	{
		driver = IntializeDriver();
		driver.get(url);
		
		
		
		Homepage h = new Homepage(driver);
		h.sign().click();
		Signinpage1 s1 = new Signinpage1(driver);
		s1.Emailid().sendKeys("viggilucifer@gmail.com");
		s1.submit().click();
		Signinpage2 s2 = new Signinpage2(driver);
		s2.pass().sendKeys("Blah567$$");
		s2.submit2().click();
		
		//log.info(text);
		
		
	}

	
	
}
