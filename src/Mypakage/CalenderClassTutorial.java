package Mypakage;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalenderClassTutorial {

	public static void main(String[] args) {
		//calender has more features than date class
		
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(cal.getTime()));
		
		System.out.println(cal.get(Calendar.DATE));

	}

}
