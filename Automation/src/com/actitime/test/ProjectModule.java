package com.actitime.test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	@Test(priority = 1)
	public void createProject()
	{
		Reporter.log("CREATEPROJECT",true);
	}
	@Test(priority = 2 , invocationCount = 4)
	public void modifyProject()
	{
		Reporter.log("MODIFYPROJECT",true);
	}
	@Test(dependsOnMethods = "createProject")
	public void deleteProject()
	{
		Reporter.log("DELETEPROJECT",true);
	}
}
