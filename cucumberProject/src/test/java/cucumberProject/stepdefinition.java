package cucumberProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class stepdefinition {
	WebDriver driver= new ChromeDriver();

	@Given("I search Amazon website")
	public void i_search_amazon_website() {
		driver.get("https://www.amazon.com");
	    throw new io.cucumber.java.PendingException();
	}

	@When("I search for {string} devices")
	public void i_search_for_devices(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I add the first item to the cart")
	public void i_add_the_first_item_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the first item to the cart")
	public void i_verify_the_first_item_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
}
