package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends BaseClass {
	public LoginPage lp;

	public void initObject() {
		lp = new LoginPage(driver);
	}

	@BeforeClass
	public void init() {
		launchBrowser();

		initObject();
	}

	@Test
	public void VerifyLogin() {
		lp.LoginApplication();
		lp.clickOnLoginbutton();
	}

	@AfterClass
	public void tearDown() {
		tear();
	}

}
