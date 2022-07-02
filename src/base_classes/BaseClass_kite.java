package base_classes;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility_classes.Utility_kite;

public class BaseClass_kite 
{
	public WebDriver driver;
	
	public void launchKiteLogin() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Desktop\\harshada\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_kite.readDataFromProperty("URL"));
		
	}

}
