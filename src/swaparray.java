
public class swaparray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {2,4,5,6,9};
int temp;

	for(int i=0;i<5;i++)
	{
		for(int j=i+1;j<5;j++)
		{
		if(a[i]>a[j])
		{
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		}
		}
}
	for(int i=0;i<5;i++) {
		System.out.println(a[i]);
	}
	}

}
