package Lab2.Day2.Assignment8c;

public class Loan {
	int loanNo;
	int accountNo;
	int customerNo;
	float loanAmount;
	int loanDuration;
	float interest;
	static int  loanCounter=100;
	private Loan(){
		loanCounter++;
	}
	private Loan(int accountNo,int customerNo,int loanDuration,float loanAmount,float interest){
		loanCounter++;
	}
	float calculateInstallments() {
		return 0;
	}
	public int getLoanNo() {
		return loanNo;
	}
	public void setLoanNo(int loanNo) {
		this.loanNo = loanNo;
	}
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getCustomerNo() {
		return customerNo;
	}
	public void setCustomerNo(int customerNo) {
		this.customerNo = customerNo;
	}
	public float getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getLoanDuration() {
		return loanDuration;
	}
	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}
	public float getInterest() {
		return interest;
	}
	public void setInterest(float interest) {
		this.interest = interest;
	}
	public static void getLoadInstance() {
		Loan obj=new Loan();
		//return obj;
	}
	public static int getNumberOfObjects() {
		return loanCounter;
	}
	
	
	
}
