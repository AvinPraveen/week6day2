package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features ="src/test/java/Features/Login.feature",
		glue = {"LoginStep","BeforeLogin"},					 
		monochrome = true )
public class RunloginAlone extends AbstractTestNGCucumberTests{

	
	
}
