package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList a=new ArrayList();
System.out.println(a.size());
a.add(34);
a.add(45);
a.add(67);
System.out.println(a.size());
for(int i=0;i<=a.size()-1;i++) {
	System.out.println(a.get(i));
}
//String arraylist
ArrayList <String>s=new ArrayList <String>();
s.add("Minal");
s.add("Java");
s.add("Selenium");
s.add("Rest Assured");
System.out.println("Size of aaray is :"+s.size());

for(String e:s)
{
	System.out.println(e);
}
//int array
int Arrays []=new int[]{23,56,567,687,78};
System.out.println(Arrays.length);

//object array

ArrayList <Object> obj=new ArrayList<Object>();
System.out.println(obj.size());
obj.add("Minal");
obj.add('c');
obj.add(23);
obj.add(12.455f);
obj.add(4556.78983456d);
System.out.println(obj.size());

Iterator it=obj.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}



	}
	

}