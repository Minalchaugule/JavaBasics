
public class StaticVar {
	String Name;//instance variables -it changes object to object
	String Address;//y Instance variable- b'coz it is tied to object creation
	static String City="Bangalore";//Static variable -called as class variable -it is common for all object
	static int i=0;
	
	StaticVar(String Name,String Address)
	{
	this.Name=Name	;//this operator is used to refer current instance variable
	this.Address=Address;//variables which comes in constructor are called as local variables
	i++;
	System.out.println(i);
	}
	
	public void getaddress()
	{
		System.out.println(Address+" "+City);
	}
	public static void getCity()
	{
		System.out.println(City);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StaticVar sv=new StaticVar("Prisha","Sarjapura Road");
StaticVar sv1=new StaticVar("Minal","Jaynagara");
sv.getaddress();
sv1.getaddress();
sv.getCity();
	}

}
