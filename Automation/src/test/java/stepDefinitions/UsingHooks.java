package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class UsingHooks {
	
	@Before("@MobileTest")
	public void beforeExecution() {
		System.out.println("Hooks runs when & where required before the scenarios");
		
	}
	
	
	@After("@MobileTest")
	public void AfterExecution() {
		System.out.println("Hooks runs when & where required before the scenarios");
		
	}
	
	
	@Before("@WebTest")
	public void beforeWebExecution() {
		System.out.println("Hooks runs when & where required before the Web scenarios");
		
	}
	
	
	@After("@WebTest")
	public void AfterWebExecution() {
		System.out.println("Hooks runs when & where required before the Web scenarios");
		
	}


}
