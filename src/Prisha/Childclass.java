package Prisha;

public class Childclass extends Parentclass {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Childclass c=new Childclass();
c.publish();
c.like();
c.comment();
c.report();
	}

	public void report() 
	{
		System.out.println("Reprot the article/video");
	}


}
