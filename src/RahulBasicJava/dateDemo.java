package RahulBasicJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class dateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Date d=new Date();
System.out.println(d.toString());

SimpleDateFormat sdf=new SimpleDateFormat("MM/d/yyyy");
System.out.println(sdf.format(d));

SimpleDateFormat sdf1=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
System.out.println(sdf1.format(d));

SimpleDateFormat sdf2=new SimpleDateFormat("dd-MMMM-yyyy");
System.out.println(sdf2.format(d));

SimpleDateFormat sdf3=new SimpleDateFormat("dd MMMM yyyy zzzz");
System.out.println(sdf3.format(d));

SimpleDateFormat sdf4=new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
System.out.println(sdf4.format(d));

SimpleDateFormat sdf5=new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
System.out.println(sdf5.format(d));
	}

}
