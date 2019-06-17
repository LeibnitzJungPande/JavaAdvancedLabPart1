package Lab2.Assignment31;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeInfo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> employeeId=new ArrayList<Integer>();
		employeeId.add(1001);
		employeeId.add(1002);
		employeeId.add(1003);
		for(int i =0;i<employeeId.size();i++) {
			int j=employeeId.get(i);
			System.out.println(j);
		}
		
		
	}
}
