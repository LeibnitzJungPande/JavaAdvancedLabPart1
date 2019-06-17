package Lab2.Assignment28;

public class WellsBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer john = new Customer();
		john.setCustomerId(101);
		john.setCustomerName("babu");
		john.setCustomerAddress("usa");
		john.setPincode(1234);
		System.out.println("id="+john.getCustomerId());
		System.out.println("name="+john.getCustomerName());
		System.out.println("address="+john.getCustomerAddress());
		System.out.println("pincode="+john.getPincode());
	}

}
