package manageStore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import manageStore.Customer.GenderEnum;

public class CustomerOperations {
	private Customer customer;
	private Billing bill;
	double amount;
	private Address customerAddr;
    private Map<String, Customer> custMap = new HashMap<String, Customer>();
    private List<Billing> billsList;
    
	Set<String> custIDSet = new HashSet<String>();			//---List of customer id

    public void addCustomer(Customer customer) {						// --- ADD CUSTOMER ---
    	//add customer to hashmap, using customer id as the key 
    	custMap.put(customer.getCustID(), customer);
    }
   
    public Customer getCustomer(String custID) {							// ---GET CUSTOMER-----
		customer = custMap.get(custID);
    	return customer;
	}
    public void updateCustAddrCity(String custID, String city) {		// --- UPDATE ADDRESS CITY ---
    	//add customer to hashmap,using customer id as the key 
    	custMap.get(custID).getCustomerAddr().setCity(city);
    	System.out.println("Updated Address: ");
    	custMap.get(custID).getCustomerAddr().getAddress();
    }
    
    public void updateCustAddrState(String custID, String state) {		// --- UPDATE ADDRESS STATE ---
    	//add customer to hashmap,using customer id as the key 
    	custMap.get(custID).getCustomerAddr().setState(state);
    	System.out.println("Updated Address: ");
    	custMap.get(custID).getCustomerAddr().getAddress();
    }
    
    public void updateCustAddrCountry(String custID, String country) {		// --- UPDATE ADDRESS COUNTRY ---
    	//add customer to hashmap,using customer id as the key 
    	custMap.get(custID).getCustomerAddr().setCountry(country);
    	System.out.println("Updated Address: ");
    	custMap.get(custID).getCustomerAddr().getAddress();
    }
   
    public void addCustomerBill(String custID, Billing bill){			// ---- ADD BILL ---
    	custMap.get(custID).setBill(bill);
    	
	}
    
    public double totalAmountOwed(String custID) {							// ---- RETURNS TOTAL AMOUNT OWED ---
    	double totAmt=0.0;
    	billsList = customer.getListOfBills(custID);
    	System.out.println(billsList);
    	for(String cust: custMap.keySet()) {
    		if(cust == custID) {
    			for(int i = 0;i<billsList.size(); i++) {
    	    		totAmt = totAmt+ billsList.get(i).getBillAmount();
    	    	}
    		}
    	}
    	System.out.println("Total Amount owed: "+totAmt);
    	return totAmt;
    }
	
    public double getBillAmount(String custID, String billID) {							//----Get Bill details ------
    	List<Billing> listOBills = custMap.get(custID).getListOfBills(custID);
    	
    	//custMap.get(custID).getBill().getBillD();
    	for(int i=0; i<listOBills.size(); i++) {
			if(listOBills.get(i).toString().equalsIgnoreCase(billID)) {
				amount = listOBills.get(i).getBillAmount();
			}
		}
    	return amount;
	}
    
    public List<Billing> getListOfAllBills(String custID){					//----Get List of Bill----
		return custMap.get(custID).getListOfBills(custID);
	}
    
    public List<Customer> findByLocation(String location){
		   return null;
	}
	
    public void printAllCustomers() {
    	
    	System.out.println(Arrays.asList(custMap));
    }
    
	public void billPaidCust() {
		customer.getBill();;
	}
	
//	public void printAllCustomers() {
//		Iterator itr = custIDSet.iterator();
//		while(itr.hasNext()) {
//			System.out.println(custIDSet.toString());
//		}	
//		
//	}
//    public void updateBill(String checkbillID, double amountPaid) {		//---Update bill amount---
//		for(int i=0;i<listOfBills.size();i++) {
//			if(listOfBills.get(i).getBillD().contains(checkbillID)) {
//				newAmount = listOfBills.get(i).getBillAmount()-amountPaid;
//				if(newAmount==0) {
//					listOfBills.get(i).setPaid(true);
//				}else {
//					listOfBills.get(i).setBillAmount(newAmount);
//					System.out.println("New Amount for billId "+ listOfBills.get(i).getBillD()+"= "+listOfBills.get(i).getBillAmount());
//				}
//			break;
//			}
//		}
//		
//	}

      
	public void customersFromLocation(List<Customer> setOfCustomers, String location) {
		
		for(int i=0;i<setOfCustomers.size(); i++) {
			System.out.println("Customers from "+location);
			if (setOfCustomers.get(i).customerAddr.getCity().equalsIgnoreCase(location)) {
				System.out.println(setOfCustomers.get(i).getFname()+" "+setOfCustomers.get(i).getLname()+" , "+setOfCustomers.get(i).getCustID());
			}System.out.println();
		}
		
	}
	
	
	
	
	

}
