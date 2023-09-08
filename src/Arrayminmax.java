
public class Arrayminmax {
	//find out minimum number in the matrix and then in the same column find out max number
//steps to follow -find min no first then find column number then find out max no
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int abc[][]= {{45,60,25},{10,89,32},{65,43,21}};
int min=abc[0][0];
int mincolumn=0;
for(int i=0;i<=2;i++)
{
	for(int j=0;j<=2;j++)
	{
		if(abc[i][j]<min)
		{
			min=abc[i][j];
			mincolumn=j;
		}
	}
}
int max=abc[0][mincolumn];
int k=0;
while(k<3)
{
	if(abc[k][mincolumn]>max)
	{
		max=abc[k][mincolumn];
	}
	k++;
}
	System.out.println(max);
	}

}
