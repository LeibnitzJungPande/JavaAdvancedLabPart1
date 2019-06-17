package Lab2.Assignment19.com.Wellsbank.Account;
import Lab2.Assignment19.com.Wellsbank.Customer.Customer;
public class SavingAccount extends Account{
	double minimumBalance=500;
	int InterestRate=12;;
	SavingAccount(){
		
	}
	public SavingAccount(int AccountNo,Customer customer,double balance){
		super(AccountNo,customer,balance);
	}
	
	public void withdraw(double amount) {
		double temp;
		temp = balance-amount;
		if(temp>=minimumBalance) {
			balance=temp;
		}
		else {
			System.out.println("Not sufficient funds available for withdraw");
		}
	}
	
	public double calculateInterest() {
		return(InterestRate/100*balance);
		
	}

}
