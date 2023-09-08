package Exception;



public class ExceptionDemo {
	//one try block can be followed by multiple catch blocks
	int a=4;
	
	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
		int b=7;
		int c=0;
		try
		{
		int k=b/c;
		System.out.println(k);
		
		}
		catch(Exception e) 
		{
			System.out.println("can't be divided by zero");
		}
	finally
		{
			//This block is executed irrespective of exception throws or not
			//when will be finally block not executed-when jvm stops excution ,manually stoping execution
			System.out.println(" executed");
		}
	}

	
		
	}


