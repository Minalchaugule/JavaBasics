package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer, String> hm=new HashMap<Integer, String>();
hm.put(1001,"Minal");
hm.put(1002, "Prisha");
hm.put(1003, "Tanish");
System.out.println(hm.put(10034,"Vipul"));//null
System.out.println(hm.size());
Set s=hm.keySet();
System.out.println(s);
//retrieving data each for loop
for(Object obj:s)
{

System.out.println(hm.get(obj));
	}
//retrieving data using iterator
Iterator it=s.iterator();
while(it.hasNext())
{
	Object key=it.next();
	System.out.println(hm.get(key));
}

}
}