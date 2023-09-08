
public class Supchild extends Supparent {
	//super keyword is used to call parent 
	//class variables /methods when names are same in parent and child class
	
	String s="Prisha";
	public Supchild()
	{
		System.out.println("Child Constructor");
	}
	public void getstringdata()
	{
	System.out.println(s);	
	System.out.println(super.s);
	}
	
	public void senddata()
	{
		super.senddata();
		System.out.println("I am child class method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supchild sc=new Supchild();
sc.getstringdata();
sc.senddata();

	}

}
