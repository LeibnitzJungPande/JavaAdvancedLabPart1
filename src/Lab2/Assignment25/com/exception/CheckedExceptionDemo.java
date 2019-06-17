package Lab2.Assignment25.com.exception;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionDemo a=new ExceptionDemo();
		try {
			Class.forname("message");
		}
		catch(ClassNotFoundException e) {
			System.out.println("Exception is "+e);
		}
		

}
}
