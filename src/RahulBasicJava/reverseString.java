package RahulBasicJava;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="ana";
System.out.println(s);
String t="";
for(int i=s.length()-1;i>=0;i--)
{
	t=t+s.charAt(i);
}
System.out.println(t);

if(s.equalsIgnoreCase(t))
{
	System.out.println("it is palindrome");
}
else
{
	System.out.println("it is not palindrome");	
}
	}
	

}
