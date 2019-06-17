package Lab2.Assignment15;



public class WellsBank {
	Account account;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer john = new Customer(1,"Hari Baniya","kathmandu",98756);
		SavingAccount sv= new SavingAccount(1001,john,1000);
		transaction(sv,1000);
		System.out.println("The available balance is"+sv.balanceEnquiry());
		sv.withdraw(1600);
		System.out.println("The available balance is"+sv.balanceEnquiry());
		Customer jenny = new Customer(2,"kalu pande","Biratnagar",74639);
		CurrentAccount jca=new CurrentAccount(201,jenny,500, 2000);
		jca.deposit(1500);
		System.out.println("The available balance is"+(jca.balance+(-1*jca.getEligibilityAmount())));
		jca.withdraw(1000);
		System.out.println("The available balance is"+(jca.balance+(-1*jca.getEligibilityAmount())));
		jca.withdraw(4000);
		System.out.println("The available balance is"+(jca.balance+(-1*jca.getEligibilityAmount())));
		jca.withdraw(3000);
		System.out.println("The available balance is"+(jca.balance+(-1*jca.getEligibilityAmount())));
		
		
		
	}
	public static void transaction(Account account,double amount) {
		
		account.deposit(amount);
		
	}
	

}
