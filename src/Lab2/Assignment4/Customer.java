package Lab2.Assignment4;

public class Customer {
	private String cId;
	private String cName;
	private String cAddress;
	private int pinCode;
	
	
public  static void main(String[] args) {
		// TODO Auto-generated method stub
	 Customer c = new Customer();
	 c.cId="500";
	 c.cAddress="2212 Lacari St apr a6";
	 c.cName="Heri";
	 c.pinCode=1238;
	 System.out.println(c.cId+c.cAddress+c.cName+c.pinCode);

	}

}
