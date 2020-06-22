package testCases;

import org.testng.annotations.Test;

import framework.BaseTest;
import pageObjects.Login;

public class LoginTC extends BaseTest {

	@Test
	public void LoginFB() throws InterruptedException 
	{
		Login login=new Login(getDriver());
		login.setUNandPWD("ankit.bans90@gmail.com", "Test");
		login.clickLogin();
		//Thread.sleep(3000);
	}
}
