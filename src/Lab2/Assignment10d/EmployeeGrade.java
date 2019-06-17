package Lab2.Assignment10d;

public class EmployeeGrade {
	int emploeeNo;
	String employeeName;
	float customer1Feedback;
	float custorme2Feedback;
	float customer3Feedback;
	float averageFeedback;
	
	char grade;
	
	EmployeeGrade(int employeeNo,String emploeeName,float f1,float f2,float f3){
		this.emploeeNo=employeeNo;
		this.employeeName=emploeeName;
		this.customer1Feedback=f1;
		this.custorme2Feedback=f2;
		this.customer3Feedback=f3;
		
	}
	
	void calculateAverageFeedback() {
		averageFeedback=(customer1Feedback+custorme2Feedback+customer3Feedback)/3;
		
	}
	void calculateGrade() {
		if(averageFeedback>=4) {
			grade='A';
		}
		else if(averageFeedback>=3) {
			grade='B';
		}
		else if(averageFeedback>=2) {
			grade='C';
		}
		else {
			grade='D';
		}
	}
	void displayInfo() {
		System.out.println("Employee Name is"+employeeName);
		System.out.println("Employee Number is "+emploeeNo);
		System.out.println("Averrage Feedback is"+averageFeedback);
		System.out.println("Grade is "+grade);
		
	}

}
