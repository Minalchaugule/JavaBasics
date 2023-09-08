package TestNGTutorial;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Parameters({"url"})
	@BeforeMethod
	public void launchBrowser(String url)
	{
		System.out.println("Launching the browser :before method ");
		System.out.println(url);
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		System.out.println("closing the browser : after method");
	}

	@Test
	public void WebLoginHomeLoan()
	{
		System.out.println("Web Login for Home Loan");
	}
	
	@Test(groups={"Regression"})
	public void MobileLoginHomeLoan()
	{
		System.out.println("Mobile Login for Home Loan");
	}
	
	@Test
	public void APILoginHomeLoan()
	{
		System.out.println("API Login for Home Loan");
	}
}

