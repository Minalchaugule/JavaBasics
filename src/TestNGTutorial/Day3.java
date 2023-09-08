package TestNGTutorial;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Day3 {
	
	@AfterClass
	public void executeAfterDay3()
	{
		System.out.println("excute after Day3 class");
	}
	
	@BeforeClass
	public void executeBeforeDay3()
	{
		System.out.println("excute before Day3 class");
	}

	@Test(priority=3)
	public void WebLoginCarLoan()
	{
		System.out.println("Web Login for Car Loan");
	}
	
	@Test(groups={"Regression"},priority=2)
	public void MobileLoginCarLoan()
	{
		System.out.println("Mobile Login for Car Loan");
	}
	
	@Test(priority=1,invocationCount=5)
	public void APILoginCarLoan()
	{
		System.out.println("API Login for Car Loan");
	}
}
