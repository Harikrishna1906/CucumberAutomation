package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EcommerceStepDefinition {

	WebDriver driver;

	@Given("^User is on the Landing page$")
	public void user_is_on_the_landing_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("Https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@When("^user searches for the \"([^\"]*)\" vegetable$")
	public void user_searches_for_the_something_vegetable(String strArg1) throws Throwable {

		WebElement ele = driver.findElement(By.xpath("//input[@type='search']"));
		ele.sendKeys(strArg1);
		Thread.sleep(4000);

	}

	@Then("^\"([^\"]*)\" results should be displayed$")
	public void something_results_should_be_displayed(String strArg1) throws Throwable {

		String vegetable = driver.findElement(By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]")).getText()
				.toString();
		System.out.println(vegetable);

		if (driver.findElement(By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]")).getText().contains(strArg1)) {

			System.out.println("The product matches with the " + strArg1);

		} else {

			System.out.println("The product does not match with the " + strArg1);

		}

		driver.quit();

		// String we =
		// driver.findElement(By.cssSelector("h4.product-name")).getText().toString();
		// System.out.println(we);

		// Assert.assertEquals(strArg1, vegetable);
		// Assert.assertTrue(driver.findElement(By.xpath("//h4[contains(text(),'Cucumber
		// - 1 Kg')]")).getText().contains(strArg1));

		// Assert.assertTrue(driver.findElement(By.cssSelector("h4.product-name")).getText().contains(strArg1));
		// (vegetable, "Cucumber - 1 Kg");

		// Assert.assertTrue(driver.findElement(By.xpath("//h4")).getText().contains(strArg1));

	}

	@And("^adds \"([^\"]*)\" to the cart$")
	public void adds_something_to_the_cart(String strArg1) throws Throwable {
		driver.findElement(By.xpath("//a[@class='increment']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'ADD TO CART')]")).click();
	}

	@And("^navigates to the cart$")
	public void navigates_to_the_cart() throws Throwable {

		driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();

	}

	@Then("^Verify \"([^\"]*)\" is displayed in the cart$")
	public void verify_something_is_displayed_in_the_cart(String strArg1) throws Throwable {

		try {
			WebElement verify = driver.findElement(By.xpath("//p[@class='product-name']"));
			Assert.assertTrue(verify.getText().toString().contains(strArg1));
			System.out.println("The vegetable in the cart matches with the " + strArg1);
		} catch (Exception e) {
			System.out.println("The vegetable in the cart does not match with the " + strArg1);
		}
		
		driver.quit();

	}
	

}
