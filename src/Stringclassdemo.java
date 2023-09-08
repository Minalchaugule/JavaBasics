
public class Stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String class is one of the  pre built class in java
		//in how many ways we can define string -string literal and by creating object of string class
		//in string lateral ,java create object for string class in backend and then assign to variable  and if same string is created ,first java will check in 
				//string pool ,if string is present it simply assign the new variable
				
				//in string object creation,even though same string is defined ,java will create 2 separate object for each string
				
		String a="Hello"; //string literal
		String b="Hello";
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("o"));
		
		String a1=new String("Hello");//by creating object
		
		String b1=new String("Hello");
		
		String s="Javatraining";
		System.out.println(s.substring(1,5));//substring method used to capture some data from success messages like product is purchased successfully for $10.so 
		System.out.println(s.substring(3));
		System.out.println(s.concat(" from udemy"));
		System.out.println(s.length());
		String m= " minal prisha ";
		System.out.println(m.trim());
		System.out.println(m.toUpperCase());
		System.out.println(m.toLowerCase());
		String arr[]=s.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(s.replace("t","b"));
		
	}


}