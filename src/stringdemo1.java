
public class stringdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="Minal";
System.out.println(a);
String b="";
for(int i=a.length()-1;i>=0;i--)
{
b=b+a.charAt(i)	;

}
System.out.println(b);

if(a==b)
{
	System.out.println("It is palindrome");
}
else
{
	System.out.println("It is palindrome");
}
}
}