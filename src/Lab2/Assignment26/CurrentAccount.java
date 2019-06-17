package Lab2.Assignment26;

public class CurrentAccount extends Account {
	double currentAmount;
	CurrentAccount(){
		
	}
	CurrentAccount(int accountNo,Customer customer,double balance,double currentAmount){
		super(accountNo,customer,balance);
		this.currentAmount=currentAmount;
		
	}
	public void withdraw(double Amount)throws InsufficientBalanceException{
		
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
			throw new InsufficientBalanceException();
		}
		
	}
	double getEligibilityAmount() {
		return -10000;
	}
}
