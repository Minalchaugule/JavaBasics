package Newpractice;

public class This {
	
	int a=12;
	
	public void senddata()
	{
		int a=30;
		System.out.println(a);
		System.out.println(this.a);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This t=new This();
		t.senddata();
	}

}
