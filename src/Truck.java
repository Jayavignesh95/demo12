
public class Truck extends vehicles
{
  public double loading_capacity;
  
  void getVehiclesDetails()
  {
	  System.out.println("TRUCK DETAILS");
	  System.out.println("Enter the Register Number:");
		 reg_numb=v.nextLine();
		 System.out.println("Enter the Manufacturer_Name:");
		 manuf_name=v.nextLine();
		 System.out.println("Enter the Model:");
		 models=v.next();
		 System.out.println("Enter the Number of wheels:");
		 wheels=v.nextInt();
		 System.out.println("Enter the Amount of Load:");
		 loading_capacity=v.nextDouble();
		 
  }
  
  void showVehiclesDetails()
  {
	   
	   System.out.println("Regsiter Number:"+reg_numb);
	   System.out.println("Manufacturer Name:"+manuf_name);
	   System.out.println("Model Number:"+models);
	   System.out.println("Number of Wheels:"+wheels);
	   System.out.println("Amount of Load:"+loading_capacity);
	   
	   
  }
}
