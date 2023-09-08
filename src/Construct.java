//block of code executed whenever object is created
//constructor don't have return type
//constructor have same name as class name
public class Construct {
	
	public Construct()
	 {
		System.out.println("I am default constructor"); 
	 }
	public Construct(int a,int b)
	{
		System.out.println("I am parameterised constructor");
		int c=a+b;
		System.out.println(c);
	}
	public Construct(String str)
	{
		System.out.println(str);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Construct c=new Construct("Hello");
 Construct c1=new Construct(34,56);
 Construct c2=new Construct();
 //whenever you create an object ,constructor is called.

	}

}
