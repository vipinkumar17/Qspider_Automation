package moduleTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority = 1)
	public void createProject()
	{
		Reporter.log("CREATE PROJECT",true);
	}
	@Test(priority = 2,invocationCount = 4)
	public void modifyProject()
	{
		Reporter.log("MODIFY PROJECT",true);
	}
	@Test(dependsOnMethods = "createProject")
	public void deleteProject()
	{
		Reporter.log("DELETE PROJECT",true);
	}
}
