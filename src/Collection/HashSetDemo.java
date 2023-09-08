package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	//set doesn't accept duplicate values
//when to use arraylist- u added 1porduct in cart and trying to add again -so unit no will get changed
	//when to use set -when u added product and try to add again ,it says product is in ur cart already/recharging ur simcard from any app
	//set -elements stored in random order
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> h=new HashSet<String>();
		h.add("India");
		h.add("USA");
		h.add("UK");
		h.add("India");
		System.out.println(h);
		h.remove("UK");
		h.add("Canada");
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		//h.clear();
		System.out.println(h.contains("India"));
		System.out.println(h.equals("USA"));
		
		Iterator<String> i=h.iterator();
		System.out.println(i.next());
		System.out.println(i.hasNext());
		i.hasNext();
		
		

	}

}
