
public class Roadtransport implements Transport
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Transport t=new Roadtransport();
t.fillfuel();
t.checkair();
t.registration();
System.out.println(t.lic);

Roadtransport r=new Roadtransport();
r.roadsafety();
	}

	@Override
	public void fillfuel() {
		// TODO Auto-generated method stub
		System.out.println("Fill the fuel at petrol bunk");
	}

	@Override
	public void checkair() {
		System.out.println("Check air in the tyres");// TODO Auto-generated method stub
		
	}

	@Override
	public void registration() {
		// TODO Auto-generated method stub
		System.out.println("Validate registration documents");
	}
	
	public void roadsafety()
	{
		System.out.println("Follow road safety rules");
	}

}
