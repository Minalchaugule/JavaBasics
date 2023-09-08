
public class AirIndia extends Parentaircraft {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AirIndia a=new AirIndia();
a.bodycolor();
a.engine();
a.Safetyguidelines();

//as parent class is abstract class ,we can't instantiate
//Parentaircraft p=new Parentaircraft();
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("AirIndia color and logo is defined as white and blue ");
	}

}
