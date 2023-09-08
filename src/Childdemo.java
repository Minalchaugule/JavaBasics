
public class Childdemo extends Parentdemo {
	
	public void engine() {
		System.out.println("new Engine code is implemented");
	}
public void color()
{
	System.out.println("color selected");
}
public void audiosystem()
{
	System.out.println("child audiosystem is implemented");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Childdemo cd=new Childdemo();
  System.out.println(cd.color);
  cd.gear();
  cd.audiosystem();
  cd.brakes();
  cd.color();
  cd.engine();
	}

}
