package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		
		this.driver =driver;
		
	}
	
	By search =By.xpath("//input[@type='search']");
	By vegetable = By.xpath("//h4[contains(text(),'Cucumber - 1 Kg')]");
	By increment = By.xpath("//a[@class='increment']");
	By addToCart = By.xpath("//button[contains(text(),'ADD TO CART')]");
	By navigateToCart = By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]");
	
	
	public WebElement getSearch() {
		
		return driver.findElement(search);
	}
	
	

	public WebElement vegetable() {
		
		return driver.findElement(vegetable);
	}
	
	public WebElement increment() {
		
		return driver.findElement(increment);
		
	}
	
	public WebElement addToCart() {
		
		return driver.findElement(addToCart);
		
	}
	
	public WebElement navigateToCart() {
		
		return driver.findElement(navigateToCart);
		
	}
}
