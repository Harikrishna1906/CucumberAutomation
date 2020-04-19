package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Cucumber.Automation.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddToCart;
import pageObjects.CheckOutPage;
import pageObjects.Homepage;

public class EcommerceStepDefinition {

	public WebDriver driver;
	Homepage h; //= new Homepage(driver);
	AddToCart atc; //= new AddToCart(driver);
	CheckOutPage cop; //= new CheckOutPage(driver);

	@Given("^User is on the Landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		driver = Base.getDriver();

	}

	/*@When("^user searches for the (.+) vegetable$")
	public void user_searches_for_the_something_vegetable(String strArg1) throws Throwable {
		h = new Homepage(driver);
		h.getSearch().sendKeys(strArg1);
		Thread.sleep(4000);

	}*/
	
	 @When("^user searches for the (.+) vegetable$")
	    public void user_searches_for_the_vegetable(String vegetablenames) throws Throwable {
		 h = new Homepage(driver);
			h.getSearch().sendKeys(vegetablenames);
			Thread.sleep(4000);
	    }

   
	 @And("^adds (.+) to the cart$")
	    public void adds_to_the_cart(String vegetablenames) throws Throwable {
		 h = new Homepage(driver);
			h.increment().click();
			h.addToCart().click();
	    }

	/*@And("^adds \"([^\"]*)\" to the cart$")
	public void adds_something_to_the_cart(String strArg1) throws Throwable {
		h = new Homepage(driver);
		h.increment().click();
		h.addToCart().click();
	}*/
	
	
	

	@And("^navigates to the cart$")
	public void navigates_to_the_cart() throws Throwable {
		h = new Homepage(driver);
		atc = new AddToCart(driver);
		
		h.navigateToCart().click();
		Thread.sleep(5000);
		atc.proceed().click();

	}

	/*@Then("^Verify \"([^\"]*)\" is displayed in the cart$")
	public void verify_something_is_displayed_in_the_cart(String strArg1) throws Throwable {
		cop = new CheckOutPage(driver);

		try {
			Assert.assertTrue(cop.verifyTheContents().getText().contains(strArg1));
			System.out.println("The vegetable in the cart matches with the " + strArg1);
		} catch (Exception e) {
			System.out.println("The vegetable in the cart does not match with the " + strArg1);
		}

	}*/
	
	 @Then("^Verify (.+) is displayed in the cart$")
	    public void verify_is_displayed_in_the_cart(String vegetablenames) throws Throwable {
		 
		 cop = new CheckOutPage(driver);

			try {
				Assert.assertTrue(cop.verifyTheContents().getText().contains(vegetablenames));
				System.out.println("The vegetable in the cart matches with the " + vegetablenames);
			} catch (Exception e) {
				System.out.println("The vegetable in the cart does not match with the " + vegetablenames);
			}
	    	
	       
	    }


}
