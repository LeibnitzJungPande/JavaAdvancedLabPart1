package Lab2.Assignment19.com.Wellsbank.Account;
import Lab2.Assignment19.com.Wellsbank.Customer.Customer;
public abstract class Account {
	int accountNo;
	Customer customer;
	double balance;
	abstract public void withdraw(double amount);
	Account(){
		
	}
	public Account(int accountNo,Customer customer,double balance){
		this.accountNo=accountNo;
		this.customer=customer;
		this.balance=balance;
	}
	public Customer getCustomer() {
		Customer customer = new Customer();
		return customer;
	}
	public double balanceEnquiry() {
		return balance;
	}
	public void deposit(double amount) {
		
		balance=balance+amount;
	}
}
