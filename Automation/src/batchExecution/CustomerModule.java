package batchExecution;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerModule {
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
	Reporter.log("CREATE CUSTOMER",true);
}
@Test
public void deleteCustomer()
{
	Reporter.log("DELETE CUSTOMER",true);
}
}
