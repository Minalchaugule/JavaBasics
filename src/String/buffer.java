package String;
//string buffer is also final class ,only tosrtingis overrided
//need to crate object with help of new operator
//it implements only serialisable 
//it is mutable
public class buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer("Minal");
		StringBuffer sb1=new StringBuffer("Minal");
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		System.out.println(sb.hashCode());//different hashcode even when content is same
		System.out.println(sb1.hashCode());
		System.out.println(sb.equals(sb1));//it compares address not content
		StringBuffer sb2=new StringBuffer("Prisha");
		System.out.println(sb.append(sb2));
		System.out.println(sb1.reverse());
	}

}
