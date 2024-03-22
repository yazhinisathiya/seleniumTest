package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//Features"
,glue = "stepDefs",
monochrome=true,
dryRun = false,
plugin = {"pretty",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
}
		//"json:target\\JsonReport.json"
//}
		//"html:target\\HtmlReport.html"}
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