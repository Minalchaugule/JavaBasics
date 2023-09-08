package Prisha;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="madam";
String t="";
for(int i=s.length()-1;i>=0;i--)
{
	t=t+s.charAt(i);
	
}
System.out.println(t);
if(s==t)
{System.out.println("it is polindrome");
	}
else {
	System.out.println("It is not polindrome");
}

}
}