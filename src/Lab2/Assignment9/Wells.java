package Lab2.Assignment9;

public class Wells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeGrade elvis = new EmployeeGrade();
		elvis.initializeEmployee(1,"Leibnitz", 4, 4, 4);
		elvis.calculateAverageFeedback();
		elvis.calculateGrade();
		elvis.displayInfo();
		EmployeeGrade martha = new EmployeeGrade();
		martha.initializeEmployee(2,"randi", 4, 4);
		martha.calculateAverageFeedback();
		martha.calculateGrade();
		martha.displayInfo();
	}

}
