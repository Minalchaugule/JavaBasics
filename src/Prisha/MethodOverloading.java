package Prisha;

public class MethodOverloading {
	public void senddata(char c)
	{
		System.out.println(c);
	}
	public void senddata(int a)
	{
	System.out.println(a);
	}
	public void senddata(int a,double b)
	{
		System.out.println(a);
		System.out.println(b);
	}
	public void senddata(String s)
	{
	System.out.println(s);	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 MethodOverloading m=new MethodOverloading();
 m.senddata('s');
 m.senddata("Tanu");
 m.senddata(10);
 m.senddata(20,204.4564);
 
	}

}
