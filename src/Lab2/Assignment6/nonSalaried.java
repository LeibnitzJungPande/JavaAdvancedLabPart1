package Lab2.Assignment6;

public class nonSalaried extends Account{
	
	nonSalaried(String fname,String lname,String email,String dob,String gender,String mStatus,double b){
		setFname(fname);
		setDob(dob);
		setEmail(email);
		setLname(lname);
		setGender(gender);
		setMaritalStaus(mStatus);
		setBenefit("Atm Card and discount on shopping");
		openAccount(b);
	}
	void openAccount(double b) {
		
			++cId;
			++account;
			setBalance(b);
			display(cId,account);
		}
	void display(int cId,int acc) {
		System.out.println("The customer id and account number is "+cId+"and "+account+"respectively");
		System.out.println("name is"+getFname()+getLname());
		System.out.println("Balance is "+getbalance());
		
	}

}
