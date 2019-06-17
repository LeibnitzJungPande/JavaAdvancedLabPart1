package Lab2.Assignment26;

public abstract class Account {
	int accountNo;
	Customer customer;
	double balance;
	abstract void withdraw(double amount) throws InsufficientBalanceException;
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
