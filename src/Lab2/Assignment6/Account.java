package Lab2.Assignment6;

public class Account {
	private String fname;
	private String lname;
	private String mname;
	private String email;
	private String dob;
	private String gender;
	private String maritalStaus;
	private String benefit;
	private double balance;
	static int account=100000;
	static int cId=0;
	public double getbalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public String getBenefit() {
		return benefit;
	}
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMaritalStaus() {
		return maritalStaus;
	}
	public void setMaritalStaus(String maritalStaus) {
		this.maritalStaus = maritalStaus;
	}
	

}
