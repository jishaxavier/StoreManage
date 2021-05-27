package manageStore;

import java.util.ArrayList;
import java.util.List;

import manageStore.Customer.GenderEnum;

public class CustomerApp {

	public static void main(String[] args) {
		
		CustomerOperations operations = new  CustomerOperations();
	
		//String fname, String lname, String custID, String date, GenderEnum gender, AddressClass customerAddr, BillingClass bill
		Customer cc1 = new Customer("Jish","Xavi", "c101", "April 21", GenderEnum.FEMALE);
		Customer cc2=new Customer("sandy", "joseph", "c102", "June 08", GenderEnum.MALE);
		Customer cc3 = new Customer("chinju", "goerge", "c103","July 03", GenderEnum.FEMALE);
			
		//int houseNum, String street, String city, String state, String country, String zip
		cc1.setCustomerAddr(new Address(41, "Vedette Way", "Vaughan", "Ontario", "Canada", "L4H4K2"));
		cc2.setCustomerAddr(new Address(1001, "Mabelle Ave", "Toronto", "Ontario", "Canada", "M9A4X9"));
		cc3.setCustomerAddr(new Address(543, "Manzanillo", "Toronto", "Ontario", "Canada", "M4C6L3"));
		
		//String billID,double billAmt, String dateofPayment, Boolean paid
		cc1.setBill(new Billing("B123", 102.35, "4/13/21", false));
		cc1.setBill(new Billing("B124", 200.09, "4/22/21", false));
		cc2.setBill(new Billing("B223",236.00, "5/15/21", false));	
		
		//Added 3 customers
		operations.addCustomer(cc1);
		operations.addCustomer(cc2);
		operations.addCustomer(cc3);
		
		//Added Address to the customers
		operations.addCustomerBill("c101", new Billing("B123", 102.35, "4/13/21", false));
		operations.addCustomerBill("c101", new Billing("B124", 200.09, "4/22/21", false));
		
		//operations.printAllCustomers();
		//System.out.println(operations.getBillAmount("c101", "B124"));
		System.out.println(operations.totalAmountOwed("c101"));
		//Get Customers from Toronto
			
		//customersFrom(setOfCustomers,"Toronto");
				
					
	}

}
