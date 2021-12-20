package com.actitime.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class CustomerModule1 {
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
	@Test
	public void createCustomer()
	{
		Reporter.log("CREATECUSTOMER",true);
	}
	@Test
	public void modifyCustomer()
	{
		Reporter.log("MODIFYCUSTOMER",true);
	}
	@Test
	public void deleteCustomer()
	{
		Reporter.log("DELETECUSTOMER",true);
	}
}
