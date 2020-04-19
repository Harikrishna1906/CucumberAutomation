package stepDefinitions;

import java.util.List;

import org.junit.runner.RunWith;

import Cucumber.Automation.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.Homepage;

@RunWith(Cucumber.class)
public class StepDefinition extends Base{
	Homepage h; //= new Homepage(driver);
	
	
	  @Given("^The test to be run on Chrome browser$")
	    public void the_test_to_be_run_on_chrome_browser() throws Throwable {
	      System.out.println("Write the code for Chrome driver");
	    }

	    @When("^The browser is triggered by the user$")
	    public void the_browser_is_triggered_by_the_user() throws Throwable {
	    	System.out.println("Invoke the Chrome driver");
	    }
	    
	    @And("^Verify the Chrome browser is opened$")
	    public void verify_the_chrome_browser_is_opened() throws Throwable {
	    	System.out.println("Chrome broswer is opened");
	        
	    }

	    @And("^clear the cache$")
	    public void clear_the_cache() throws Throwable {
	    	System.out.println("Cache cleared successfully");
	    }

	    @Then("^Enter the Bank URL$")
	    public void enter_the_bank_url() throws Throwable {
	    	System.out.println("Successfully entered URL www.atombank.co.uk");
	    }

	   
	    @And("^Verify the Landing page is loaded$")
	    public void verify_the_landing_page_is_loaded() throws Throwable {
	    	System.out.println("Landing page loaded successfully");
	    }

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
	 
	 
	 @Then("^\"([^\"]*)\" results should be displayed$")
		public void something_results_should_be_displayed(String strArg1) throws Throwable {
		 
		 h = new Homepage(driver);

			String vegetable = h.vegetable().getText();
			System.out.println(vegetable);

			if (h.vegetable().getText().contains(strArg1)) {

				System.out.println("The product matches with the " + strArg1);

			} else {

				System.out.println("The product does not match with the " + strArg1);

			}

			
		}
	 
	



}
