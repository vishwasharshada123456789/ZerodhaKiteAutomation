package utility_classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utility_kite 
{
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myprop=new FileInputStream("C:\\Users\\Satish\\eclipse-workspace\\Selenium Practice\\KiteData.properties");
		prop.load(myprop);
		String value = prop.getProperty(key);
		return value;
	}
	
	public static void scroll(WebDriver driver, WebElement element)
	{
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeAsyncScript("arguments[0].scrollIntoView", element);
		
	}
	
	public static void waits(WebDriver driver,int timeunit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
	}

}
