
public class Arraymaxmin {
	//find out max number in the matrix and then in the same row find out min number
	//steps to follow -find max no first then find row number then find out min no
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{45,60,25},{10,89,32},{65,43,21}};
		int max=abc[0][0];
		int maxrow=0;
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				if(abc[i][j]>max)
				{
					max=abc[i][j];
					maxrow=i;
				}
			}
		}
		int min=abc[maxrow][0];
		int k=0;
		while(k<3)
		{
			if(abc[maxrow][k]<min)
			{
				min=abc[maxrow][k];
			}
			k++;
		}
			System.out.println(min);
			}

		

	}


