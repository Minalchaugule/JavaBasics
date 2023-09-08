
public class Arraydemo {

	//Array is container which stores multiple values of same data type
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[5];//declaring array and locating memory for the values
a[0]=2;
a[1]=12;
a[2]=22;
a[3]=32;
a[4]=42;//initializing values into array

//Array literal
int b[]={2,5,8,7,8};

for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);//retrieving the values
}
for(int i=0;i<b.length;i++)
{
	System.out.println(b[i]);
}

	}

}
 