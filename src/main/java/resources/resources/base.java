package resources;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class base {
	
	public static String url; //template 	
	 
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver IntializeDriver() throws IOException 
	{
		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\java selenium\\chromedriver105.exe");
	driver = new ChromeDriver();
	//driver1 = new 
	prop = new Properties();
	FileInputStream fis=new FileInputStream("data.properties");
	
	prop.load(fis);
	url = prop.getProperty("url");
	
	return driver;
	}
}
