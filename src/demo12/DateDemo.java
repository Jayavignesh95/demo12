package demo12;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
   public static void main(String[] args) {
	Date a=new Date();
	System.out.println("The date is ");
	System.out.println(a.toString());
	System.out.println(a.toGMTString());
	System.out.println(a.toLocaleString());
	Date a1=new Date();
	a1.setDate(4);
	a1.setHours(2);
	a1.setMinutes(44);
	//System.out.println(a1.toString());
}
}
