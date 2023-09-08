
public class Supparent {
 public Supparent()
 {
	System.out.println("Parent Constructor"); 
 }
	String s="Minal";
	
	public void senddata()
	{
		System.out.println("I am parent class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Supparent s=new Supparent();
s.senddata();
	}

}
