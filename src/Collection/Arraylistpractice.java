package Collection;

import java.util.ArrayList;

public class Arraylistpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> s=new ArrayList <String>();
ArrayList <String> s1=new ArrayList <String>();
s.add("Java");
s.add("Manual Testing");
s.add("API");
s.add("Selenium");
s1.add("Sandeep");
s1.add("Minal");
s1.add("Prisha");
System.out.println(s);
System.out.println(s1);
System.out.println(s.size());
System.out.println(s.indexOf("API"));
s.add(4,"Database");
System.out.println(s);
System.out.println(s.isEmpty());
System.out.println(s.subList(2,4));
System.out.println(s1.clone());
System.out.println(s.lastIndexOf("API"));
System.out.println(s.equals(s1));
System.out.println(s.hashCode());
	}

}
