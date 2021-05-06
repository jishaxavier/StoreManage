package manageStore;

import java.util.ArrayList;
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
	private Address customerAddr;
    private Map<String, Customer> custMap = new HashMap<String, Customer>();
    List<Billing> listOfBills = new ArrayList<Billing>();	//---List of Bills
	Set<String> custIDSet = new HashSet<String>();			//---List of customer id

    public void addCustomer(Customer customer) {
    	//add customer to hashmap, using customer id as the key 
    	custMap.put(customer.getCustID(), customer);
    }
   
    public void updateCustomer(Customer customer) {
    	//add customer to hashmap
    	///using customer id as the key 
    }
   
    public double addCustomerBill(String customerId, Billing bill){
		   return 0;
	}
	
    public void getBill() {							//----Get Bill details ------
		for(int i=0; i<listOfBills.size(); i++) {
			bill.getBill();
		}
	}
    
    public void listAllBills() {					//----Get List of Bill----
		for(int k=0; k<listOfBills.size();k++) {
			listOfBills.get(k).getBill();
		}
	}
    
    public void setBill(Billing bill) {				//----Add bills to existing customer----
		this.bill = bill;
		listOfBills.add(this.bill);
	}
	
	public List<Billing> getListOfBills() {			//----Get List of Bills----
		return listOfBills;
	}

	public void setListOfBills(List<Billing> listOfBills) {		//---Set List of Bills---
		this.listOfBills = listOfBills;
	}
	
    public List<Customer> findByLocation(String location){
		   return null;
	}
	
    public void updateAddress(Address addr) {			//---Update Address----
		setCustomerAddr(addr);
	}
	
	public void getCustomer() {							//---Get Customer-----
		
		System.out.println("Customer Id: "+custID);
		System.out.println("Customer Name: "+fname+" "+lname);
	}
	public void billPaidCust() {
		customer.getBill();;
	}
	
	public void printAllCustomers() {
		Iterator itr = custIDSet.iterator();
		while(itr.hasNext()) {
			System.out.println(custIDSet.toString());
		}	
		
	}
    public void updateBill(String checkbillID, double amountPaid) {		//---Update bill amount---
		for(int i=0;i<listOfBills.size();i++) {
			if(listOfBills.get(i).getBillD().contains(checkbillID)) {
				newAmount = listOfBills.get(i).getBillAmount()-amountPaid;
				if(newAmount==0) {
					listOfBills.get(i).setPaid(true);
				}else {
					listOfBills.get(i).setBillAmount(newAmount);
					System.out.println("New Amount for billId "+ listOfBills.get(i).getBillD()+"= "+listOfBills.get(i).getBillAmount());
				}
			break;
			}
		}
		
	}

      
	public void customersFrom(List<Customer> setOfCustomers, String location) {
		
		for(int i=0;i<setOfCustomers.size(); i++) {
			System.out.println("Customers from "+location);
			if (setOfCustomers.get(i).customerAddr.getCity().equalsIgnoreCase(location)) {
				System.out.println(setOfCustomers.get(i).getFname()+" "+setOfCustomers.get(i).getLname()+" , "+setOfCustomers.get(i).getCustID());
			}System.out.println();
		}
		
	}
	
	
	
	
	

}
