package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition {

	@Given("^User is on the Banks Landing page$")
	public void user_is_on_the_banks_landing_page() throws Throwable {
		System.out.println("User on the landing page");

	}

	@When("^User enters the valid Username and Password$")
	public void user_enters_the_valid_username_and_password() throws Throwable {
		System.out.println("User entered the valid credentials and clicked Submit button");

	}

	@Then("^Customer dashboard is displayed$")
	public void customer_dashboard_is_displayed() throws Throwable {
		System.out.println("User dashboard is dispalyed");

	}

	@And("^Customers info cards are displayed$")
	public void customers_info_cards_are_displayed() throws Throwable {
		System.out.println("Customer info cards are displayed");

	}

}
