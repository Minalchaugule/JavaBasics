package TestNGTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day1 {
	
	@BeforeTest
	public void DeleteallHistory()
	{
	System.out.println("Deleting History:before test ");	
	}
	
	
	@Test(groups={"Regression"},dataProvider="getData")
	public void MobileLoginGoldLoan(String us,String psd)
	{
		System.out.println("Mobile Login for Gold Loan");
		System.out.println(us);
		System.out.println(psd);
	}
	@Parameters({"browser"})
	@Test
	public void WebLoginGoldLoan(String browserName)
	{
		System.out.println("Web Login for Gold Loan");
		System.out.println(browserName);
	}
	
	@Test
	public void APILoginGoldLoan()
	{
		System.out.println("API Login for Gold Loan");
	}
	
	@AfterTest
	public void verifydata()
	{
		System.out.println("Verify all data :After test");
	}
@DataProvider
@Test
public Object[][] getData()
{
	//1st combination-username password -ggod credit history
	//2nd -us pass - no credit history
	//3rd - us pass-fraud
	//define multidimensional array
	Object[][]data=new Object [3][2];
	data[0][0]="Minal";
	data[0][1]="Minal@123";
	data[1][0]="Prisha";
	data[1][1]="Prisha@123";
	data[2][0]="Sandy";
	data[2][1]="Sandy@123";
	return data;
}
	
	

}
