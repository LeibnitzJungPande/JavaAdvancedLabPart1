package Lab2.Assignment2;

public class EmployeeGrade {

	public static void main(String[] args) {
		int employeeId[]= {1001,1002,1003,1004,1005};
		float customer1Feedback[]= {4.1f,3.8f,4.5f,4.9f,0.0f};
		float customer2Feedback[]= {4.1f,3.8f,4.5f,4.9f,3.9f};
		float customer3Feedback[]= {4.1f,3.8f,4.5f,4.9f,3.9f};
		float averageCustomerFeedback[]= new float[5];
		char grade[]= {'A','B','C','D','E'};
		for(int i=0;i<5;i++) {
			averageCustomerFeedback[i]= (customer1Feedback[i]+customer2Feedback[i]+customer3Feedback[i])/3;
			System.out.println("The average customer feedback of emploee "+employeeId[i]+"is "+averageCustomerFeedback[i]+" and grade of employee is "+grade[i]);
		}
	}

}
