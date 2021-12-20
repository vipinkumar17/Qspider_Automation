package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModuleForBeforeClassAndMethod {
@BeforeClass
public void openBrowser()
{
	Reporter.log("OPEN Browser",true);
}
@AfterClass
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
@Test(priority = 1 , invocationCount = 2)
public void editCustomer()
{
	Reporter.log("EDITCUSTOMER",true);
}
@Test
public void registerCustomer()
{
	Reporter.log("REGISTERCUSTOMER",true);
}

@Test
public void deleteCustomer()
{
	Reporter.log("DELETECUSTOMER",true);
}

}
