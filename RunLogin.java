package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features ="src/test/java/Features/EditLead.feature",
					 glue = {"Steps","Util"},					 
			   monochrome = true )
public class RunLogin extends AbstractTestNGCucumberTests {

}
