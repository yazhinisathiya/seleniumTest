package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver driver = new ChromeDriver();
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		
		driver.get("https://www.saucedemo.com/");
		//System.out.println("I am on the login page");
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	@When("I enter valid credentials")
	public void i_enter_valid_credentials() {
		//System.out.println("I enter valid credentials");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
	}
	@And("I click the login button")
	public void i_click_the_login_button() {
		//System.out.println("I click the login button");
		driver.findElement(By.id("login-button")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Then("I should be redirected to the dashboard")
	public void i_should_be_redirected_to_the_dashboard() {
		String title=driver.getTitle();
		
		Assert.assertEquals(title, "Swag Labs");
		//System.out.println("I should be redirected to the dashboard");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@And("I should see a welcome message")
	public void i_should_see_a_welcome_message() {
		System.out.println("I should see a welcome message");
		driver.quit();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	
}
