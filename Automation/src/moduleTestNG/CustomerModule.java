package moduleTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModule 
{
	@Test(priority = 1)
	public void createCustomer()
	{
		Reporter.log("CREATE CUSTOMER",true);
	}
	@Test(priority = 2,invocationCount = 4)
	public void modifyCustomer()
	{
		Reporter.log("MODIFY CUSTOMER",true);
	}
	@Test(dependsOnMethods = "createCustomer")
	public void deleteCustomer()
	{
		Reporter.log("DELETE CUSTOMER",true);
	}
}
