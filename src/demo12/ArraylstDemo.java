package demo12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArraylstDemo {
  public static void main(String[] args) {
	ArrayList<String> num=new ArrayList<String>();
	Scanner in=new Scanner(System.in);
	for(int i=0;i<10;i++)
	{
	 	System.out.println("ENter the value for num[" +i+"]");
		num.add(in.next());
	 	
	}
	System.out.println();
	num.add(3,"12");
	System.out.println(num.toString());
}
}
