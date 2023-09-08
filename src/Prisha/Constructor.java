package Prisha;

public class Constructor {
	
	public Constructor()
	{
	System.out.println("I am Default constructor");	
	}
	public Constructor(int a,int b)
	{
		System.out.println("I am parameterised constructor");
	}
	public Constructor(String s)
	{
		System.out.println("I am string parameterised constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor c=new Constructor();
Constructor c1=new Constructor(34,12);
Constructor c2=new Constructor("Prisha");
	}

}
