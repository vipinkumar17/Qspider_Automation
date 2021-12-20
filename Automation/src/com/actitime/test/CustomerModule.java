package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule {
@Test(priority = 1)
public void createCustomer()
{
	Reporter.log("CREATECUSTOMER",true);
}
@Test(priority = 2 , invocationCount = 4)
public void modifyCustomer()
{
	Reporter.log("MODIFYCUSTOMER",true);
}
@Test(dependsOnMethods = "createCustomer")
public void deleteCustomer()
{
	Reporter.log("DELETECUSTOMER",true);
}
}
