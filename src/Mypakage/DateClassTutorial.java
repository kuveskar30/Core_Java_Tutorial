package Mypakage;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateClassTutorial {

	public static void main(String[] args) {
		// we can use current date and time usin date class
		//it comes from java.util package
		//java.lang package contains basic java stuff
		//java collections also come  from java.util package
		
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf2.format(d));
		//different letter used for different thing eg , M-month
		// see , https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
		
		System.out.println(sdf.format(d));

	}

}
