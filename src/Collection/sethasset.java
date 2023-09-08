package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Spliterator;
//set -doesnt allow duplicates and doesn't has index,
//hashset uses hastable to store data and retrieves in random order -for each and iterator

public class sethasset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
HashSet hs=new HashSet();
System.out.println(hs.size());
System.out.println(hs.isEmpty());
hs.add("Red");
hs.add("orange");
hs.add("Red");
hs.add("green");
hs.add(45);
System.out.println(hs.size());
System.out.println(hs.isEmpty());

System.out.println("retrieving using for each");
for(Object obj:hs)
{
	System.out.println(obj);
}

System.out.println("retrieving using iterator");
Iterator it=hs.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}


	}

}
