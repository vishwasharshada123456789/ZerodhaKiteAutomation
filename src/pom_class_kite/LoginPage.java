package pom_class_kite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	@FindBy(id="userid") private WebElement UN;
	@FindBy(id="password")private WebElement PWD;
	@FindBy(xpath = "//button[@type='submit']")private WebElement SUBMIT;
	@FindBy(xpath = "//p[@class='error text-center']")private WebElement ERRORTEXT;
	@FindBy(xpath = "//span[@class='su-message']") private WebElement UIerror;
	
	//constructor
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//methods
	
	public void sendusername(String un)
	{
		UN.sendKeys(un);
	}
	
	public void sendpassword(String pwd)
	{
		PWD.sendKeys(pwd);
	}
	
	public void clickonsubmit()
	{
		SUBMIT.click();
	}
	
	public String ValidUNError()
	{
		String actualerror = UIerror.getText();
		return actualerror;
	}
	
	public String ValidateError2()
	{
		String actualerror2 = ERRORTEXT.getText();
		return actualerror2;
	}
	
	

}
