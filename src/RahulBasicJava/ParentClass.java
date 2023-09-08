package RahulBasicJava;

public class ParentClass {
	
	String color="Red";
	public void Gear()
	{
		System.out.println("Gear code is implemenetd");
	}
	public void Brakes()
	{
		System.out.println("brakes code is implemented");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass s=new ParentClass();
		s.Brakes();
		s.Gear();
		System.out.println(s.color);
	}
	

}
