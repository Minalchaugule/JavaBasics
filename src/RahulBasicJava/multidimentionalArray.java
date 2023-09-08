package RahulBasicJava;

public class multidimentionalArray {

	public static void main(String[] args) {
		
	 int a[][]=new int[3][3];
	 a[0][0]=15;
	 a[0][1]=14;
	 a[0][2]=20;
	 a[1][0]=8;
	 a[1][1]=32;
	 a[1][2]=21;
	 a[2][0]=7;
	 a[2][1]=15;
	 a[2][2]=23;
	//System.out.println(a[1][0]);
	 //smallest no
	int min=a[0][0];
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 if(a[i][j]<min)
			 {
			 min=a[i][j];
		 }
	 }

		}
	 System.out.println(min);
	 
	 //Greater no
	 int max=a[0][0];
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<3;j++)
		 {
			 if(a[i][j]>max)
			 {
			 max=a[i][j];
		 }
	 }

		}
	 System.out.println(max);
	}
}
