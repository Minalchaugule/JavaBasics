package Interview;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 120, -60, 47, 86, 92, 52, 100, 36, 66, 87 };
		
		int max=arr[0];
		
		for(int i=0;i<=9;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
				
		}
		System.out.println(max);
	}
	
}
