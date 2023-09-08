package String;

public class DemoString {
//String class is a final class ,we can create object but can't override the methods
	//string class implements two interfaces serialisable and comparable
	//tostring -it returns content of string instead of address
	//equals -it compares content not address
	//hash code - if the content is same then same hash code is given
	
	public static void main(String[] args) {
		// TODO Auto-generated method  stub
String s1=new String("Minal");
String s2=new String ("Minal");
String s3=new String("MinalPrisha");
System.out.println(s1.equals(s2));
System.out.println(s1.toString());
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());

String m="London";//constant pool area
String n= new String("Bangalore");//non constant pool area
System.out.println(m.toString());
System.out.println(m.hashCode());
System.out.println(m.equals(n));

//String is immutable class- means object content can't be changed,if we try to change it ,it will create a new object
String a="Prisha";
//String a=a+"Minal";//cant change
String b="Prisha";
System.out.println(a);
System.out.println(b);





	}

}
