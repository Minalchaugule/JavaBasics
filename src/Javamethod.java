
public class Javamethod {

	int a=5;
	public void getdata()
	{
		System.out.println("I am method");
	}
	public String validatedata()
	{
		System.out.println("I am returning srting");
		return "Pass";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("I am main method");
		Javamethod j=new Javamethod();
		j.getdata();
		j.validatedata();	

System.out.println(j.a);

//calling other class method
Javamethod1 m=new Javamethod1();
m.setdata();
	}
}
