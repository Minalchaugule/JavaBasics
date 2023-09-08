
public class Overloading {
	
	public void senddata(int a)
	{
		System.out.println(a);
	}
public void senddata(int a,double b)
{
	System.out.println(b);
}
public void senddata(String a)
{
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading o=new Overloading();
o.senddata(27);
o.senddata("Prisha");
o.senddata(51,123.4354644);
	}

}
