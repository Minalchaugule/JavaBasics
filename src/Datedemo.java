import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();

System.out.println(d.toString());
SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
System.out.println(sdf.format(d));
SimpleDateFormat sd=new SimpleDateFormat("F");//which day of month count
System.out.println(sd.format(d));
SimpleDateFormat s1=new SimpleDateFormat("E");//day of week
System.out.println(s1.format(d));
SimpleDateFormat s2=new SimpleDateFormat("w");//current week in the year
System.out.println(s2.format(d));
SimpleDateFormat s3=new SimpleDateFormat("D");//current day in the year
System.out.println(s3.format(d));
SimpleDateFormat s4=new SimpleDateFormat("k");//current hr 
System.out.println(s4.format(d));
SimpleDateFormat s5=new SimpleDateFormat("z");//timezone 
System.out.println(s5.format(d));
SimpleDateFormat s6=new SimpleDateFormat("a");//am/pm
System.out.println(s6.format(d));
SimpleDateFormat s7=new SimpleDateFormat("G");
System.out.println(s7.format(d));
	}
	}
	
	


