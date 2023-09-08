package RahulBasicJava;

public class ChildClass extends ParentClass{

	public void Engine() {
		System.out.println("Engine code is implemented in child class");
	}
	public void color()
	{
	System.out.println(color);	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass c=new ChildClass();
		c.Brakes();
		c.Gear();
		c.color();
		c.Engine();

	}

}
