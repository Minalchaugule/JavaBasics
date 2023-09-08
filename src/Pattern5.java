
public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int star=1;
for(int i=1;i<=5;i++)
{
	for(int j=5;j>1;j--)
	{
		System.out.print(" ");
	}
	
for(int k=1;k<=star;k++)
{
System.out.print("*");	
}
	
star+=2;
System.out.println( );
	}
	}
}
