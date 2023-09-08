package Collection;

import java.util.HashMap;
import java.util.Set;

public class Maphashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap hm=new HashMap();
hm.put("1001","Minal");
hm.put("1002","Prisha");
hm.put("1003","Sandy");
hm.put("1004","Tanish");
hm.put("","Tanu");

System.out.println(hm.size());
System.out.println(hm);

Set s=hm.keySet();

for(Object obj:s)
{
	System.out.println(hm.get(obj));
}
	}

}
