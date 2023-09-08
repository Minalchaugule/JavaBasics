
public class Maxnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c[][]= {{23,34,56},{23,67,80},{-19,77,10}};
int max=c[0][0];
for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		if(c[i][j]>max)
		{
			max=c[i][j];
		}
	}
}
System.out.println(max);
}
}