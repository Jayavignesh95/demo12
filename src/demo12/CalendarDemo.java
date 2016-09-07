package demo12;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String[] args) throws ParseException {
		/*
		 * Calendar cal=Calendar.getInstance();
		 * System.out.println(cal.get(Calendar.AUGUST));
		 * System.out.println(cal.getTime());
		 * System.out.println(cal.getTimeZone());
		 * System.out.println(Calendar.AM); System.out.println(Calendar.AM_PM);
		 * System.out.println(Calendar.ALL_STYLES);
		 */
		Calendar cal2 = Calendar.getInstance();
		System.out.println(cal2.get(Calendar.DATE));
		// cal2.add(Calendar.MONTH, -d1);
		System.out.println(cal2.get(Calendar.MONTH));
		SimpleDateFormat dt = new SimpleDateFormat("EEE,MM,YYYY,z");
		String sdate = dt.format(cal2.getTime());
		// String a=cal2.getTime().toString();
		System.out.println(sdate);
		Date aq = dt.parse("Thu,19,1995,IST");
		System.out.println();

		System.out.println(aq.toString());
	}
}
