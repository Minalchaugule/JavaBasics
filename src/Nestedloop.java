
public class Nestedloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//nested loop works 
for(int i=1;i<=4;i++)//outer loop -this block loops for 4 times
{
	System.out.println("Outer loop started");
	for(int j=1;j<=4;j++)//inner loop-16 times need to run 
	{
	System.out.println("inner loop");	
	}
	System.out.println("outer loop finished");
}
	}

}
