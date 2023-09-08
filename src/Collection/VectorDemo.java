package Collection;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
System.out.println("capacity of vector "+ v.capacity());
System.out.println("size of vector "+ v.size());
v.add("Prisha");
v.add("Prisha");
v.add("Anvi");
v.add("Thiea");
v.add("River");
System.out.println(v);
System.out.println("size of vector"+ v.size());
System.out.println("retrieving data using for loop");
for(int i=0;i<=v.size()-1;i++) {
	System.out.println(v.get(i));
}

System.out.println("retrieving data using each for loop");
for(Object a:v)
{
	System.out.println(a);
}


System.out.println("retrieving data using iterator");
Iterator it=v.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}
System.out.println("retrieving data using Listiterator-forword direction");
ListIterator lt=v.listIterator();
while(lt.hasNext())
{
	System.out.println(lt.next());
}

System.out.println("retrieving data using Listiterator-backword direction");

while(lt.hasPrevious())
{
	System.out.println(lt.previous());
}
	}
	}

