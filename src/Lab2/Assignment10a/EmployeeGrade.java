package Lab2.Assignment10a;

public class EmployeeGrade {
	int emploeeNo;
	String employeeName;
	float customer1Feedback;
	float custorme2Feedback;
	float customer3Feedback;
	float averageFeedback;
	int count=0;
	char grade;
	EmployeeGrade(){
		this.emploeeNo=1;
		this.employeeName="Ram";
		this.customer1Feedback=4.0f;
		this.custorme2Feedback=4.1f;
		this.customer3Feedback=4.3f;
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
