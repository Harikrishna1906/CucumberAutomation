package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EcommerceStepDefinition {
	
	WebDriver driver;

	@Given("^User is on the Landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Resource\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://rahulshettyacademy.com/seleniumPractise");
		String webpageName = driver.getWindowHandle().toString();
		System.out.println(webpageName);

	}

	@When("^user searches for the \"([^\"]*)\" vegetable$")
	public void user_searches_for_the_something_vegetable(String strArg1) throws Throwable {
		
		WebElement ele = driver.findElement(By.xpath("//input[@type='search']"));
		ele.clear();
		ele.sendKeys(strArg1);

	}

	@Then("^\"([^\"]*)\" results should be displayed$")
	public void something_results_should_be_displayed(String strArg1) throws Throwable {
		WebElement vegName = driver.findElement(By.xpath("//h4[@class='product-name'] "));
		String vegetable = vegName.getText().toString();
		Assert.assertEquals(strArg1, vegetable);
		
		
			

	}

}
