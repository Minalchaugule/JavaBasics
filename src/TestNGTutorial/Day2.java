package TestNGTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {
	
	@BeforeSuite
	public void executeBeforeSuite()
	{
		System.out.println("execute before Suite");
	}
	
	@AfterSuite
	public void executeAftereSuite()
	{
		System.out.println("execute before Suite");
	}
	
	@Test(priority=1,groups={"Regression"})
	public void MobileLoginPersonalLoan()
	{
		System.out.println("Mobile Login for Personal Loan");
	}
	
	@Test
	public void WebLoginPersonalLoan()
	{
		System.out.println("Web Login for Personal Loan");
	}
	
	@Test
	public void APILoginPersonalLoan()
	{
		System.out.println("API Login for Personal Loan");
	}

}
