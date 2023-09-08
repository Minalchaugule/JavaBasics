
public class Arraypractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[4];
a[0]=11;
a[1]=13;
a[2]=21;
a[3]=31;
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
int b[]= {4,6,8,0};
for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}
int c[][]=new int[3][2];
c[0][0]=12;
c[0][1]=34;
c[1][0]=54;
c[1][1]=67;
c[2][0]=89;
c[2][1]=66;

System.out.println(c[0][1]);

for(int i=0;i<=2;i++)
{
	for(int j=0;j<=1;j++)
	{
		System.out.println(c[i][j]);
	}
}

int d[][]= {{1,2,3,4},{10,9,8,7}};
for(int i=0;i<=1;i++)
{
	for(int j=0;j<=3;j++)
	{
		System.out.println(d[i][j]);
	}
}
		}
}