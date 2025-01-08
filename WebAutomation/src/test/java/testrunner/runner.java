package testrunner;

//import io.cucumber.core.snippets.SnippetType;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
		features = {
				"src/test/java/stories/login.feature",
				"src/test/java/stories/packagecreation.feature"
		},
		dryRun = !true,
		glue = "steps"
		//monochrome = true
		
		)
public class runner extends AbstractTestNGCucumberTests{

}
