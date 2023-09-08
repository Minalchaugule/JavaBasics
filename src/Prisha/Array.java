package Prisha;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*int a[]=new int [5];
a[0]=23;
a[1]=21;
a[2]=78;
a[3]=56;
a[4]=67;
for(int i=0;i<=4;i++)
{
	System.out.println(a[i]);
}
int b[]= {12,23,45,56,67};
for(int i=0;i<=4;i++)
{
	System.out.println(b[i]);
}*/


	int c[][]=new int[3][4];
	c[0][0]=12;
	c[0][1]=14;
	c[0][2]=16;
	c[0][3]=18;
	c[1][0]=38;
	c[1][1]=36;
	c[1][2]=34;
	c[1][3]=32;
	c[2][0]=41;
	c[2][1]=43;
	c[2][2]=45;
	c[2][3]=47;
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=3;j++)
		{
			System.out.println(c[i][j]);
		}
	}
	int d[][]= {{12,10,20},{34,45,56},{58,79,80}};
	for(int i=0;i<=2;i++)
	{
		for(int j=0;j<=2;j++)
		{
			System.out.println( d[i][j]);
		}
	}
}
	}
	