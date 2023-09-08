package String;

public class StringMethods {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Minal";
String m=" Sandy";

//System.out.println(s.charAt(5));//String index out of bound exception
System.out.println(s.charAt(3));
System.out.println(s.compareTo(m));//false
System.out.println(s.substring(2));//nal
System.out.println(s.subSequence(2, 4));//nal
System.out.println(s.concat(m));//minalSandy
System.out.println(s.length());//5
System.out.println(s.indexOf('a'));//3
System.out.println(m.trim());//remove spaces
	}

}
