import java.util.*;

import demo12.testcase;
public class vehicles
{
 String reg_numb;
 int wheels;
 String manuf_name,models;
 Scanner v = new Scanner(System.in);
   void vshow()
   {
	   System.out.println("From vehicles");
   }
   void getVehiclesDetails()
   {
	   
	 System.out.println("Enter the Register Number:");
	 reg_numb=v.nextLine();
	 System.out.println("Enter the Manufacturer_Name:");
	 manuf_name=v.next();
	 System.out.println("Enter the Model:");
	 models=v.next();
	 System.out.println("Enter the Number of wheels:");
	 wheels=v.nextInt();
	
	 
   }
   void showVehiclesDetails()
   {
	   System.out.println("Regsiter Number:"+reg_numb);
	   System.out.println("Manufacturer Name:"+manuf_name);
	   System.out.println("Model Number:"+models);
	   System.out.println("Number of Wheels:"+wheels);
	 
   }
}

