
public class Human extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human h=new Human();
h.eat();
h.sleep();
h.speak();
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
	System.out.println("Human speaks");	
	}

}
