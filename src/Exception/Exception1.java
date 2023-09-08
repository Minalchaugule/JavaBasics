package Exception;

public class Exception1 {
	
	
int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			 int c=30/2;//Arithmatic exception
			 System.out.println(c); 
		 }
		catch(ArithmeticException ae){
			System.out.println("arithmatic exception");
			
		}
		finally { 
			System.exit(0);
			System.out.println("finally block is always executed");  
			}    
	}

}
