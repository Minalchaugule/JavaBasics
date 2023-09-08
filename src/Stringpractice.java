
public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String m="madam";
System.out.println(m);
String n="";
for(int i=m.length()-1;i>=0;i--)
{
	n=n+m.charAt(i);
	
}
System.out.println(n);
if(m==n)
{
	System.out.println("String is polindrome");
}
else
{
	System.out.println("String is not polindrome");
}
	}

}
