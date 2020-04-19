package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {

	public WebDriver driver;

	public AddToCart(WebDriver driver) {

		this.driver = driver;
	}

	By proceed = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");

	public WebElement proceed() {

		return driver.findElement(proceed);
	}

}
