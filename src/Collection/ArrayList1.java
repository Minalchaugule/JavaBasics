package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Arraylist is collection of interfaces and classes and we can store any type of elements.allow duplicate,retrievinf in insertion order
		//and retrieval will happen in 4 ways -for ,each for ,iterator and list iterator
ArrayList a=new ArrayList();
System.out.println(a.isEmpty());
a.add(12);
a.add(23.456f);
a.add('a');
a.add("Minal");
a.add(true);
a.add(1234567898l);
a.contains(12);
System.out.println(a.size());

//retrieving using for loop

for(int i=0;i<=a.size()-1;i++)
{
	System.out.println(a.get(i));
	
}
a.remove(2);
System.out.println(a.size());

//retrieving using each for
int Array[]=new int[] {1,34,56,34};
for(int b:Array)
{
	System.out.println(b);
}

char Array1[]=new char[] {'P','r','i','s','h','a'};
for(int c:Array1)
{
	System.out.println(c);
	
}
//retreivng using iterator
ArrayList al=new ArrayList();
al.add("minal");
al.add("Prisha");
al.add(123);
al.add(235.889f);
al.add(false);
al.add(4567876545l);
al.add('v');
System.out.println(al.isEmpty());
System.out.println(al.size());

Iterator it=al.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

//retrieving using ListIterator
ArrayList l=new ArrayList();
l.add("London");
l.add("Kini");
l.add("Belgaum");
l.add("Bangalore");
System.out.println(l.size());

ListIterator lt=l.listIterator();
System.out.println("retreving data in forward direction");
while(lt.hasNext())
{
	System.out.println(lt.next());
}

System.out.println("retreving data in reverse direction");
while(lt.hasPrevious())
{
	System.out.println(lt.previous());
}




}
	
}
