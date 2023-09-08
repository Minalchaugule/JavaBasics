package RahulBasicJava;

public class childemiratesAircraft extends Parentaircraft
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childemiratesAircraft ch=new childemiratesAircraft();
		ch.safetyGuidelines();
		ch.engine();
		ch.bodyColor();
	}
	

	@Override
	public void bodyColor() {
		System.out.println("Emirates body color:Red");
		
	}

	
	
}
