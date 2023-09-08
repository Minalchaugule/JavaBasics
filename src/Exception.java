
public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a=3;
int b=0;

try
{
	int k=a/b;
	
	System.out.println(k);
}
	
catch(ArithmeticException e)
{
	System.out.println("Arithmatic exception");
}*/

try {
	int array[]=new int[4];
	//array[3]="abc";
	//System.out.println(array[5]);
}
catch(ArrayStoreException ae) {
	System.out.println("Array out of bound exception");
}
	}


}