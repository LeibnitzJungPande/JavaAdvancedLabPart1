package Lab2.Assignment23;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null;
		int total=100,count=0;
		try {
			int average =total/count;
			System.out.println(average);
			System.out.println(name.length());
			System.out.println("END OF TRY BLOCK");
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception"+e.getMessage());
		}
		catch(NullPointerException e) {
			System.out.println("Object is null");
		}
		System.out.println("Program continued normally");
		name="john";
		System.out.println(name.length());

	}

}
