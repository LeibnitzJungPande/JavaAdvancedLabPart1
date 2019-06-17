package Lab2.Assignment8;

public class Wells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeGrade emp = new EmployeeGrade();
		emp.initializeEmployee(1,"Leibnitz", 4, 4, 4);
		emp.calculateAverageFeedback();
		emp.calculateGrade();
		emp.displayInfo();

	}

}
