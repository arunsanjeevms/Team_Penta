package pack1;

public class Customer {
	private String Customer_Name;
	Customer(){
		System.out.println("["+Customer_Name+"]Customer Entered the Restaurant...");
	}
	public void setCustomer_Name(String customer_Name) {
		Customer_Name = customer_Name;
	}
	public String getCustomer_Name() {
		
		return Customer_Name;
	}

}
