package parallelExecutionCrossBrowserTesting;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClassCrossBrowser;

public class ProjectModule extends BaseClassCrossBrowser {
	@Test
	public void createProject()
	{
		Reporter.log("CREATEPROJECT",true);
	}
	@Test
	public void modifyProject()
	{
		Reporter.log("MODIFYPROJECT",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("DELETEPROJECT",true);
	}
}
