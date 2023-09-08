package Prisha;

public class Child implements Parent{

	

	@Override
	public void getdata() 
	{
	System.out.println("getting data");	// TODO Auto-generated method stub
		
	}

	@Override
	public void verifydata() {
		// TODO Auto-generated method stub
		System.out.println("Verifying data");
	}

	@Override
	public void senddata() {
		// TODO Auto-generated method stub
		System.out.println("sending data");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Parent p=new Child();
 p.getdata();
 p.verifydata();
 p.senddata();
	}

}
