package Lab2.Assignment30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EmployeeInfo {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee[]=new Employee[4];
		for(int i=0;i<4;i++) {
			employee[i]=new Employee();
		}
		employee[0].employeeId=5001;
		employee[1].employeeId=5002;
		employee[2].employeeId=5003;
		employee[3].employeeId=5004;
		
		List list=new ArrayList();
		for(int i=0;i<4;i++) {
			list.add(employee[i]);
		}
		for(Object list1:list) {
			 System.out.println(list1);
		}
		/*Other Ways of doing the same
		 * 
		ListIterator litr = list.listIterator();
	      
	      while(litr.hasNext()) {
	         Object element = litr.next();
	         System.out.println(element);
	      }
		for (int i = 0; i < list.size(); i++) {
			
		    System.out.println(list.get(i));
		}
		*/
	
	}

}
