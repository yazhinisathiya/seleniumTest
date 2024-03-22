package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features//GoogleSearhRunner.feature"
,glue = "stepDefs",
monochrome=true,
dryRun = false

)
public class GoogleSearhRunner extends AbstractTestNGCucumberTests {

}
