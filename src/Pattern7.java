
public class Pattern7 {

	public static void main(String[] args) {
		int n =1;
		// TODO Auto-generated method stub
		int s=n*2;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int k=1;k<=s-(2*i);k++)
			{
				System.out.print(" ");
			
			for(int l=1;l<=i;l++)
			{
				System.out.print("*");
			}
			}
			System.out.println();
		}
		

	}

}
