package Exception;

public class Demoexception {

	int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

 try {
	 int c=30/0;//Arithmatic exception
	 System.out.println(c); 
 }
catch(ArithmeticException ae){
	System.out.println("arithmatic exception");
}
 
 //Arrayout of bound exception
 try {
	  int Array[]=new int[4];
	 Array[5]=23;
 }
 catch(ArrayIndexOutOfBoundsException e) {
	 System.out.println("Array Index Out Of Bound Exception");
 }
 //class type exception
 try {
 Demoexception e=(Demoexception) new Object();
	}
 catch(ClassCastException e)
 {
	 System.out.println("Class Cast Exception handled");
 }
//nullpointer exception
 try {
	 
	 Demoexception d=null;
	 System.out.println(d.id);
	 }
 catch(NullPointerException e)
 {
	 System.out.println("Null pointer exception");
	 //e.printStackTrace();
 }
}
}