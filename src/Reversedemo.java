
public class Reversedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String s="Minal";
 String t="";
 System.out.println(s);
 for(int i=s.length()-1;i>=0;i--)
 {
	 //System.out.println(s.charAt(i));
	 t=t+s.charAt(i);
	 
 }
 System.out.println(t);
 if(s==t)
 {
	 System.out.println("It is polindrome");
 }
 else
 {
	 System.out.println("it is not polindrome");
 }
	}

}
