package Lab2.Assignment19.com.Wellsbank.Account;
import Lab2.Assignment19.com.Wellsbank.Customer.Customer;
public class CurrentAccount extends Account {
	double currentAmount;
	CurrentAccount(){
		
	}
	public CurrentAccount(int accountNo,Customer customer,double balance,double currentAmount){
		super(accountNo,customer,balance);
		this.currentAmount=currentAmount;
		
	}
	public void withdraw(double Amount){
		double temp;
		temp= balance-Amount;
		if(temp>0) {
			balance=balance-Amount;
		}
		else if(temp>=getEligibilityAmount()) {
			balance=temp;
		}
		else {
			System.out.println("Exceeded the eligibility limit cannot withdraw that amount");
		}
	}
	public double getEligibilityAmount() {
		return -10000;
	}
}
