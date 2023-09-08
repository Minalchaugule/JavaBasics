
public class Stringreverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String a="madam";
		System.out.println(a);
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println(b);
	
if(a==b)
{
	System.out.println("It is polindrome");
}
else
{
	System.out.println("It is not polindrome");
}
a.indexOf("v");
a.toUpperCase();
System.out.println(a);
b.toLowerCase();
System.out.println(b);
a.replace("v", "y");
System.out.println(a);
}
}