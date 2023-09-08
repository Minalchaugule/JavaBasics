package Collection;

import java.util.ArrayList;
//Can accept duplicate values
//Arraylist,linkedlist and vector classes, implementing list interface
//array and arraylist -array is fixed size where arraylist can grow dynamically
//you can access and insert any value at any index

public class arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> a=new ArrayList <String>();
a.add("Minal");
a.add("Prisha");
System.out.println(a);
a.add(0,"Minal");
System.out.println(a);
//a.remove(1);
//System.out.println(a);
//a.remove("Prisha");
//System.out.println(a);
//a.removeAll(a);
//System.out.println(a);
System.out.println(a.get(2));

System.out.println(a.contains("Minal"));//returns boolean
System.out.println(a.indexOf("Minal"));
System.out.println(a.isEmpty());
System.out.println(a.size());
	}

}
