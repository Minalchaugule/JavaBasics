package TestNGTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day {
	
	
	@Test(dependsOnMethods= {"getLoan"})
	public void PersonalloanWebInterestTest()
	{
		System.out.println("Personal Loan interest Details");
	}
	
	@Test
	public void getLoan()
	{
		System.out.println("get the personal loan first");
	}
	
	@Test(enabled=false)
	public void Loanrecovery()
	{
		System.out.println("loan recovery");
	}
	
}
