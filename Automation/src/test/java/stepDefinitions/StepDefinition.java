package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import cucumber.api.DataTable;
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

	/*
	 * @When("^User enters the valid Username and Password$") public void
	 * user_enters_the_valid_username_and_password() throws Throwable { System.out.
	 * println("User entered the valid credentials and clicked Submit button"); }
	 */

	@When("^User enters the valid Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enters_the_valid_Username_and_Password(String arg1, String arg2) throws Throwable {
		System.out.println(arg1);
		System.out.println(arg2);

	}

	@Then("^Customer dashboard is displayed$")
	public void customer_dashboard_is_displayed() throws Throwable {
		System.out.println("User dashboard is dispalyed");

	}

	/*
	 * @And("^Customers info cards are displayed$") public void
	 * customers_info_cards_are_displayed() throws Throwable {
	 * System.out.println("Customer info cards are displayed");
	 * 
	 * }
	 */

	@Then("^Customers info cards are displayed is \"([^\"]*)\"$")
	public void customers_info_cards_are_displayed_is(String arg1) throws Throwable {
		System.out.println(arg1);

	}

	@When("^User enters the below details$")
	public void user_enters_the_below_details(DataTable data) throws Throwable {
		List<List<String>> obj = data.raw();
		System.out.println(obj.get(0).get(0));
		System.out.println(obj.get(0).get(1));
		System.out.println(obj.get(0).get(2));
		System.out.println(obj.get(0).get(3));
		System.out.println(obj.get(0).get(4));
	}
	
	
	 @When("^User enters the correct (.+) and (.+)$")
	    public void user_enters_the_correct_and(String username, String password) throws Throwable {
	        System.out.println(username);
	        System.out.println(password);
	    }


}
