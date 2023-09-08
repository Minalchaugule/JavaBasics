package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetLinkedhashset{

	public static void main(String[] args) {
		// linkedhashset uses linkedset and hashtable to store the data and retrieving happens in insertion order
		LinkedHashSet st=new LinkedHashSet();
		st.add("purple");
		st.add("indigo");
		st.add("yellow");
		st.add("green");
		st.add("blue");
		st.add("blue");
		
		System.out.println(st.hashCode());
		
		System.out.println(st.size());
		
		System.out.println("retrieving using for each loop");
		for(Object obj:st) {
			System.out.println(obj);
		}
      st.remove("green");
      System.out.println(st.equals("blue"));
		System.out.println("retrieving using iterator");
		Iterator it=st.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}


}
