
public class Methodoverloading {
	//argument count should be different or argument type should be different
	//real time eg-in the payment page for ecommerce website ,payment is a menthod but we can use different argument as debit card,credit card ,gpay etc
	public void getdata(int a)
	{
	System.out.println(a);	
	}
	public void getdata(int a,int b)
	{
	System.out.println(b);	
	}
	public void getdata(String a)
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Methodoverloading m=new Methodoverloading();
m.getdata(24);
m.getdata("Hello");
m.getdata(12,23);
	}

}
