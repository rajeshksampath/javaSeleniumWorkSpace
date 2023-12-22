package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
	@Before("@MobileTest")
	public void beforeValidation()
	{
		System.out.println("Pre requisites before running mobile test");
	}
	
	@After("@MobileTest")
	public void afterValidation()
	{
		System.out.println("After running mobile test");
	}

}
