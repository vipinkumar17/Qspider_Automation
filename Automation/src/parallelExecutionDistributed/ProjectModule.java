package parallelExecutionDistributed;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
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
