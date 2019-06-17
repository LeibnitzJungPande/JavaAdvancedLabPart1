package Lab2.Assignment13and14;

public class SavingAccount extends Account{
	double minimumBalance=500;
	int InterestRate=12;;
	SavingAccount(){
		
	}
	SavingAccount(int AccountNo,Customer customer,double balance){
		super(AccountNo,customer,balance);
	}
	void withdraw(double amount) {
		double temp;
		temp = balance-amount;
		if(temp>=minimumBalance) {
			balance=temp;
		}
		else {
			System.out.println("Not sufficient funds available for withdraw");
		}
	}
	double calculateInterest() {
		return(InterestRate/100*balance);
		
	}

}
