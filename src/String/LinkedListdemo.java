package String;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
LinkedList lst=new LinkedList ();
System.out.println("capacity "+ lst.size());
System.out.println("capacity "+ lst.isEmpty());
lst.add("pinner");
lst.add(234);
lst.add("Barnet");
lst.add(true);
lst.add('c');
lst.add(12.56f);

System.out.println("capacity "+ lst.size());
System.out.println("capacity "+ lst.isEmpty());
System.out.println(lst);

System.out.println("retrieving data using for loop");
for(int i=0;i<=lst.size()-1;i++) {
	System.out.println(lst.get(i));
}

System.out.println("retrieving data using each for loop");
for(Object obj:lst)
{
	System.out.println(obj);
}

System.out.println("retrieving data using iterator");
Iterator it=lst.iterator();
while(it.hasNext()) {
	System.out.println(it.next());
}

System.out.println("retrieving data using list iterator-forward");
ListIterator l=lst.listIterator();
while(l.hasNext())
{
	System.out.println(l.next());
}
System.out.println("retrieving data using list iterator-backword");
while(l.hasPrevious())
{
	System.out.println(l.previous());
}
	}

}
