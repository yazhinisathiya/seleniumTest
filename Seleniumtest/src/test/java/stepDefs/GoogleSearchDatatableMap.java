package stepDefs;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchDatatableMap {

	 WebDriver driver = new ChromeDriver();

	    @Given("I am on the Google search page")
	    public void i_am_on_the_google_search_page() {
	      //  driver.get("https://www.google.com");
	    	driver.navigate().to("https://www.google.com");
	    }

	    @When("I search for the following terms and language")
	    public void i_search_for_the_following_terms_and_language(DataTable dataTable) {
	        for (Map<String, String> row : dataTable.asMaps(String.class, String.class)) {
	            String searchTerm = row.get("Search Term");
	            String language = row.get("Language");
	            searchOnGoogle(searchTerm + " " + language);
	        }
	    }

	    @Then("I should see search results for each term in each language")
	    public void i_should_see_search_results_for_each_term_in_each_language() {
	        // Assertion logic to verify search results for each term in each language
	        driver.quit();
	    }

	    private void searchOnGoogle(String searchTerm) {
	        driver.findElement(By.name("q")).sendKeys(searchTerm);
	        driver.findElement(By.name("q")).submit();
	        driver.navigate().back();
	    }
}
