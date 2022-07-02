package testClass_testNG;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base_classes.BaseClass_kite;
import pom_class_kite.LoginPage;
import utility_classes.Utility_kite;

public class TestKiteLogin extends BaseClass_kite
{
	LoginPage login;
	
	@BeforeClass
	public void launchURL() throws IOException
	{
		launchKiteLogin();
		Utility_kite.waits(driver, 1000);
		login=new LoginPage(driver);
	}
	
	
	
  @Test
  public void test1() throws IOException, InterruptedException 
  {
	  login.sendusername(Utility_kite.readDataFromProperty("UI1"));
	  login.sendpassword(Utility_kite.readDataFromProperty("PWD"));
	  login.clickonsubmit();
	  Thread.sleep(300);
	  String actualerror = login.ValidUNError();
	  String Expectederror=Utility_kite.readDataFromProperty("UNError");
	  Assert.assertEquals(actualerror, Expectederror,"results not matching TC is passed");
	  Reporter.log("Results are matching TC is passed",true);
  }
  
 
}
