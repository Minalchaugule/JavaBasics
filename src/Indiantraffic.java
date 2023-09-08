
public class Indiantraffic implements Centraltraffic,Regiontraffic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//one class can implements multiple interfaces
		
Centraltraffic a=new Indiantraffic();//have created object for indiantraffic to implement methods from central traffic interface
a.greengo();
a.redstop();
a.yellowwait();
System.out.println(b);
Indiantraffic c=new Indiantraffic();
c.walksymbol();
Regiontraffic r=new Indiantraffic();
r.regionalrules();
r.regionalfine();
	}

	@Override
	public void greengo() {
		// TODO Auto-generated method stub
		System.out.println("User can go");
	}

	@Override
	public void redstop() {
		// TODO Auto-generated method stub
		System.out.println("User should stop");
	}

	@Override
	public void yellowwait() {
		// TODO Auto-generated method stub
		System.out.println("user should wait");
	}
	public void walksymbol()
	{
		System.out.println("user can walk");
	}

	@Override
	public void regionalrules() {
		// TODO Auto-generated method stub
		System.out.println("follow regional rules");
	}

	@Override
	public void regionalfine() {
		// TODO Auto-generated method stub
		System.out.println("CHeck regional fine");
	}

}
