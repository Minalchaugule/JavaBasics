
public class AccessModifier {
	//4 types -public/private/protected and default
			//default -if we mention any method as "void getdata" then it be consider as default modifier and can be accessed anywhere in package
			//public -we can access anywhere means inside any package
			//private -inside the same class only/cannot access outside the class of same package
			//protected-if method and variable are protected ,we can access those in sub classes only
			//default=protected - sub classes
	
	
	
	private int b=23;
	int c=45;
	public int a=10;
	protected char d='A';
	public void getdata() 
	{
		System.out.println("public method");
	}
	void getinfo()
	{
		System.out.println("default method");
	}
	protected void senddata()
	{
		System.out.println("Protected method");
	}
	private void print()
	{
		System.out.println("private method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AccessModifier a=new AccessModifier();
System.out.println(a.a);
System.out.println(a.b);
System.out.println(a.c);
System.out.println(a.d);
a.getdata();
a.getinfo();
a.senddata();
a.print();
		
		
	}

}
