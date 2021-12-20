package com.actitime.generic;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class LogicBaseClass {
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("OPEN Browser",true);
	}
	@AfterTest
	public void closeBrowser()
	{
		Reporter.log("CLOSE Browser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("LOGIN",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("LOGOUT",true);
	}
}
	/*    public class CustomerModule extends BaseClass
	 * {
	 * @Test
	 * }
	 * public class ProjectModule extends BaseClass
	 * {
	 * @Test
	 * }
	 */
