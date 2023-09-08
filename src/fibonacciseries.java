
public class fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30;
int t1=0;
int t2=1;
for(int i=1;i<=30;i++)
{
	System.out.println(t1);
	int sum=t1+t2;
	t1=t2;
	t2=sum;	
}

	}

}
