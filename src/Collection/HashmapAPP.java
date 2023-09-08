package Collection;

import java.util.HashMap;
import java.util.Scanner;

public class HashmapAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap <String,String> hm=new HashMap <String,String>();
hm.put( "MH","Mumbai");
hm.put( "KA","Bangalore");
hm.put( "TN","Chennai");
hm.put( "GJ","Ahmadabad");
System.out.println("Enter state name");
Scanner sc=new Scanner(System.in);
String state=sc.next();
System.out.println(hm.get(state));
	}

}
