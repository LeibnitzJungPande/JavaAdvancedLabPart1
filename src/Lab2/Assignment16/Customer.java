package Lab2.Assignment16;

public class Customer {
	private int customerId;
	private String customerName;
	private String customerAddress;
	private int pincode;
	Customer(){
		
	}
	Customer(int id,String name,String address,int code){
		this.setCustomerId(id);
		this.setCustomerName(name);
		this.setCustomerAddress(address);
		this.setPincode(code);
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
}
