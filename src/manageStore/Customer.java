package manageStore;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	public enum GenderEnum{
		FEMALE,
		MALE
	}
	private String fname;
	private String lname;
	private String custID;
	private String date;
	private GenderEnum gender;
	Address customerAddr;
	Billing bill;
	List<Billing> listOfBills = new ArrayList<Billing>();	//---List of Bills
	
	public Customer(String fname, String lname, String custID, String date, GenderEnum gender) {
		this.fname= fname;
		this.lname = lname;
		this.custID = custID;
		this.date = date;
		this.gender = gender;
	}	
	
	public String getFname() {						//----Get First Name----
		return fname;
	}
	public void setFname(String fname) {			//----Sets First Name----
		this.fname = fname;
	}
	public String getLname() {						//----Get Last Name----
		return lname;
	}
	public void setLname(String lname) {			//----Sets Last Name----
		this.lname = lname;
	}
	public String getCustID() {						//----Get Customer ID----
		return custID;
	}
	public void setCustID(String custID) {			//----Sets Customer Id----
		this.custID = custID;
	}
	public GenderEnum getGender() {					//----Get Gender ----
		return gender;
	}
	public void setGender(GenderEnum gender) {		//----Sets Gender----
		this.gender = gender;
	}
	public Address getCustomerAddr() {				//----Get Customer address----
		return customerAddr;
	}
	public void setCustomerAddr(Address customerAddr) {		//--Sets Customer address---
		this.customerAddr = customerAddr;
	}
	public Billing getBill() {						//get bill
		return bill;
	}

	public void setBill(Billing bill) {				//set bill
		this.bill = bill;
		listOfBills.add(bill);
	}

	public String getDate() {						//----Get Date---
		return date;
	}
	public void setDate(String date) {				//----Set Date ----
		this.date = date;
	}
	public List<Billing> getListOfBills(String custID){	// ---get List of bills ---
		return listOfBills;
	}
	
}
