package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class SetTreeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeSet ts=new TreeSet();
System.out.println(ts.size());
ts.add("minal");
ts.add("35");
ts.add("Pinner");
ts.add("green");
ts.add("35");
ts.add("s");


System.out.println("retrieving using for each loop");
for(Object obj:ts) {
	System.out.println(obj);
}
ts.remove("s");
ts.clear();

System.out.println("retrieving using iterator");
Iterator it=ts.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
}

}

	}


