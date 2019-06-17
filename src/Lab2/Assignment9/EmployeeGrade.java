package Lab2.Assignment9;

public class EmployeeGrade {
	int emploeeNo;
	String employeeName;
	float customer1Feedback;
	float custorme2Feedback;
	float customer3Feedback;
	float averageFeedback;
	int count=0;
	char grade;
	void initializeEmployee(int emplyeeNo,String emploeeName,float customer1Feedback,float customer2Feedback,float customer3Feedback) {
		this.emploeeNo=emplyeeNo;
		this.employeeName=emploeeName;
		this.customer1Feedback=customer1Feedback;
		this.custorme2Feedback=customer2Feedback;
		this.customer3Feedback=customer3Feedback;
		count=3;
	}
	void initializeEmployee(int emplyeeNo,String emploeeName,float customer1Feedback,float customer2Feedback) {
		
		this.emploeeNo=emplyeeNo;
		this.employeeName=emploeeName;
		this.customer1Feedback=customer1Feedback;
		this.custorme2Feedback=customer2Feedback;
		count =2;
	
	}
	void calculateAverageFeedback() {
		averageFeedback=(customer1Feedback+custorme2Feedback+customer3Feedback)/count;
		
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
