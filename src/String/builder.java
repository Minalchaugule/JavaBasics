package String;
//String builder is also final class and need to create object with new operaztor
//only equals method is overridden
//it has non synchronised methods while string buffer has synchronised methods
//synchronised
public class builder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder sb=new StringBuilder("Prisha");
StringBuilder sb1=new StringBuilder("Sandy");
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
