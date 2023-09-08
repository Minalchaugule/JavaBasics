
public class Stringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//y string is immutable -immutable means contant,it can't be changed 
		String a="Hello";
		String b="Hello";
		a.concat("World");
		System.out.println(a);
		//run the program and output is "Hello" only,as both the string a and b referring same object.hence o/p is hello .this is called immutable
	String c=a.concat("world");
	System.out.println(c);
	
	//how to work with string with modification - we can use string buffer and builder class-both are mutable,so we can change it
	StringBuffer sb=new StringBuffer("Hello");
	sb.append("World");
	System.out.println(sb);
	sb.insert(2, "she");
	System.out.println(sb);
	sb.replace(5,7,"aa" );
	System.out.println(sb);
	sb.deleteCharAt(11);
	System.out.println(sb);
sb.reverse();
System.out.println(sb);

//string builder is not thread safe or non synchronised and it is faster
//if multiple methods try to access string buffer variable sb at a time then string buffer class wont allow to work on at a time ,it managed thread control
//as when 1 task is completed then only control is given to other task.

StringBuilder sb1=new StringBuilder("Hello");
System.out.println(sb1);
sb1.append("c");
System.out.println(sb1);

//difference between == and equalsto
System.out.println(a.equals(b));//true- 
System.out.println(a==b);//true
System.out.println(a.equals(c));//false
System.out.println(a==c);//false

}

}
