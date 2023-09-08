
public class AccessMod extends AccessModifier{

	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
AccessModifier a=new AccessModifier();
System.out.println(a.a);
//System.out.println(a.b);//as it is private in other class ,we cant access
System.out.println(a.c);
System.out.println(a.d);
a.getdata();
a.getinfo();

	}

}
