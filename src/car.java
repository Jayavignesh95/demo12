
public class car extends vehicles
{
  boolean AC;
  int passenger_capacity;
  void vshow()
  {
	System.out.println("from Car");   
  }
  void getVehiclesDetails()
  {
	     //super.getVehiclesDetails();
	     System.out.println("Enter the Register Number:");
	     reg_numb=v.next();
		 System.out.println("Enter the Manufacturer_Name:");
		 manuf_name=v.next();
		 System.out.println("Enter the Model:");
		 models=v.next();
		 System.out.println("Enter the Number of wheels:");
		 wheels=v.nextInt();
		 System.out.println("A/C status:");
		 AC=v.nextBoolean();
		 System.out.println("Enter the Number of Passengers:");
		 passenger_capacity=v.nextInt();
  }
  void showCarDetails()
  {
	  System.out.println("Regsiter Number:"+reg_numb);
	   System.out.println("Manufacturer Name:"+manuf_name);
	   System.out.println("Model Number:"+models);
	   System.out.println("Number of Wheels:"+wheels);
	   System.out.println("A/C status:"+AC);
	   System.out.println("Passenger:"+passenger_capacity);
  }
}
