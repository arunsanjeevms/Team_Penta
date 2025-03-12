package pack1;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controllerclass {
public static void main(String args[]) {
	

	
	String h_name;
	String c_name;
	Scanner sc = new Scanner(System.in);
	System.out.print("Hotel Name: ");
	h_name = sc.nextLine();
	System.out.print("\n");
	System.out.print("Customer Name: ");
	c_name = sc.nextLine();
	
	ApplicationContext context = new ClassPathXmlApplicationContext("objconfiguration.xml");
	
	Hotel Hotelobj =(Hotel) context.getBean("Hotel_Bean");
	Customer Customerobj = (Customer) context.getBean("Customer_Bean");
	
	 
	 Hotelobj.setHotelName(h_name);
	 Customerobj.setCustomer_Name(c_name); 
	 
	 Hotelobj.HotelName();
	 System.out.println(Customerobj.getCustomer_Name());
	 sc.close();
}
	
	
}
