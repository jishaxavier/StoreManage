package manageStore;

public class Billing {
	private String billID;
	private double billAmount;
	private String description;
	private String dateOfPayment;
	private Boolean paid;
	
	public Billing() {
		
	}
	public Billing(String billID,double billAmt, String dateofPayment, Boolean paid) {
		this.billID = billID;
		this.billAmount = billAmt;
		this.dateOfPayment = dateofPayment;
		this.paid = paid;
		
	}
	public String getBillD() {
		return billID;
	}
	public void setBillID(String billID) {
		this.billID = billID;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDateOfPayment() {
		return dateOfPayment;
	}
	public void setDateOfPayment(String dateOfPayment) {
		this.dateOfPayment = dateOfPayment;
	}
	public Boolean getPaid() {
		return paid;
	}
	public void setPaid(Boolean paid) {
		this.paid = paid;
	}
//	public void getBill() {
//		System.out.println("BillID= "+this.billID+", Bill Amount= "+this.billAmount);
//		if(getPaid() == true) {
//			System.out.println("Bill Paid? Yes ");
//		}else {
//			System.out.println("Bill Paid? No");
//		}
//	}
	
}
