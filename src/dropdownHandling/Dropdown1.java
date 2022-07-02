package dropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dropdown1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Satish\\Desktop\\harshada\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		
		WebElement days = driver.findElement(By.id("day"));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(500));
		w.until(ExpectedConditions.visibilityOf(days));
		
		days.click();
		Select s=new Select(days);
		s.selectByVisibleText("12");
		
		Thread.sleep(300);
		
		s.selectByValue("30");
		
		Thread.sleep(300);
		s.selectByIndex(1);
		
		for(int i=0;i<=s.getOptions().size()-1;i++)
		{
			s.selectByIndex(i);
		}
		Thread.sleep(500);
		
		for(int i=0;i<=s.getOptions().size()-1;i++)
		{
			System.out.println(s.getOptions().get(i).getText());
		}
		//Thread.sleep(400);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
