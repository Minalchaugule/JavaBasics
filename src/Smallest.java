
public class Smallest {
	
	//print smallest no in the 3*3 matrix(2,4,5)(3,4,7)(1,2,9)

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]= {{34,56,99},{3,-29,90},{11,-29,69}};
int min=a[0][0];
for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		if(a[i][j]<min)
		{
			min=a[i][j];
		}
	}
}
System.out.println(min);
		}

}
