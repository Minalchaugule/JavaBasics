
public class Thisdemo {

	int a=2;
	
	public void senddata()
	{
		int a=3;
		System.out.println(a);//this referes to current object
		System.out.println(this.a);//refers to global variable
		int b=a+this.a;
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Thisdemo td=new Thisdemo();
td.senddata();
//System.out.println(td.a);
	}

}
