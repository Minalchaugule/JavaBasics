package Collection;

import java.util.ListIterator;
import java.util.Vector;

public class Vectorp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
System.out.println(v.size());
v.add(45);
v.add(78);
System.out.println(v.size());

ListIterator ls=v.listIterator();
while(ls.hasNext())
{
	System.out.println(ls.next());
}

Vector <Object> obj=new Vector<Object>();
System.out.println(obj.size());
obj.add("Minal");
obj.add('c');
obj.add(23);
obj.add(12.455f);
obj.add(4556.78983456d);
System.out.println(obj.size());

for(Object e:obj)
{
	System.out.println(e);
}
	}

	
}
