package Lab2.Assignment13and14;

public class Account {
	int accountNo;
	Customer customer;
	double balance;
	Account(){
		
	}
	Account(int accountNo,Customer customer,double balance){
		this.accountNo=accountNo;
		this.customer=customer;
		this.balance=balance;
	}
	Customer getCustomer() {
		Customer customer = new Customer();
		return customer;
	}
	double balanceEnquiry() {
		return balance;
	}
	void deposit(double amount) {
		
		balance=balance+amount;
	}
}
