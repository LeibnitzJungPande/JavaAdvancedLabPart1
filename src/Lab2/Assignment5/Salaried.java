package Lab2.Assignment5;

public class Salaried extends Account{
	final double  min=10000;
	
	Salaried(String fname,String lname,String email,String dob,String gender,String mStatus,double b){
		setFname(fname);
		setDob(dob);
		setEmail(email);
		setLname(lname);
		setGender(gender);
		setMaritalStaus(mStatus);
		setBenefit("Atm Card");
		openAccount(b);
	}
	void openAccount(double b) {
		if(b<10000) {
			System.out.println("Balance is low for salaried account. Minimum should be 10000");
		}
		else {
			++cId;
			++account;
			setBalance(b);
			display(cId,account);
		}
	}
	void display(int cId,int acc) {
		System.out.println("The customer id and account number is "+cId+" and "+account+"respectively");
		System.out.println("name is"+getFname()+getLname());
		System.out.println("balance is "+getbalance());
		
	}
}
