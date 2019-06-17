package Lab2.Assignment22;
import java.util.*;

public class EmployeeInfo {
	public static void main(String args[]) {
		Vector empList = new Vector();
		int empNo=1000;
		for(int i=1000;i<1005;i++) {
			empNo++;
			Integer iobj= new Integer(empNo);
			empList.add(iobj);
			
		}
		
		System.out.println("vector element are"+empList);
		System.out.println("unboxing");
		for(int i=0;i<5;i++) {
			
			int k = ((Integer) empList.get(i)).intValue();
			System.out.print(k+" ");
		}
		
	}
}
