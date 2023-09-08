package Newpractice;

public class Access {
	
	int a=10;
	public int b=30;
	protected char c='p';
	private String S="Prisha";
	
	void senddata()
	{
		System.out.println("default method");
	}
		
		public void getdata()
	{
		System.out.println("public method");
	}
	protected void getinfo()
	{
		System.out.println("protected method");	
	}
	private void send()
	{
		System.out.println("private method");	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Access a=new Access();
System.out.println(a.a);
System.out.println(a.b);
System.out.println(a.c);
System.out.println(a.S);
a.getdata();
a.getinfo();
a.send();
a.senddata();
	}

}
