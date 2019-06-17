package Lab2.Assignment32;
import java.lang.reflect.*;
public class TestReflection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class classobj= Class.forName("Lab2.Assignment32.Employee");
			System.out.println("Printing the method information");
			// Printing method names
			Method[] method= classobj.getMethods();
			for(Method c:method) {
				System.out.println(c.getName());
			}
			// printing field names
			System.out.println("\n Printing access specifiers and data types");
			Field[] field=classobj.getDeclaredFields();
			for(Field f:field) {
				System.out.println(f.getName());
			}
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
