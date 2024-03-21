package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features"
,glue = "stepDefs",
monochrome=true,
plugin = {"pretty"}
)
public class UserAuthTest extends AbstractTestNGCucumberTests {

}
/*
 * features = "src//test//resources//features//UserAuthentication.feature"
 * 
 * ,glue = "stepDefinations"
 * ,plugin = {"pretty", "usage:target\\UsageReport"
 */


//}