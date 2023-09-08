
public class Multidimentionalarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[][]=new int[2][3];
a[0][0]=2;
a[0][1]=4;
a[0][2]=6;	
a[1][0]=3;	
a[1][1]=5;	
a[1][2]=7;

//System.out.println(a[1][1]);
for(int i=0;i<=1;i++)
{
	for(int j=0;j<=2;j++)
	{
		System.out.println(a[i][j]);
	}
}

int b[][]= {{1,3,5},{7,9,11},{13,15,17}};//multidimentional array using array literal
//System.out.println(b[1][2]);
	}

}
