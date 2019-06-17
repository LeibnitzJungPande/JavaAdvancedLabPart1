package Lab2.Assignment11;

public class Wells {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeGrade elvis[] = new EmployeeGrade[5];
		elvis[0]= new EmployeeGrade(9000,"Leibnitz", 5, 4, 4);
		elvis[1]=new EmployeeGrade(9001,"Erika",3,2,5);
		elvis[2]=new EmployeeGrade(9002,"baba",4,5,4);
		elvis[3]=new EmployeeGrade(9002,"baba",4,5,4);
		elvis[4]=new EmployeeGrade(9002,"baba",4,5,4);
		for(int loop=0;loop<elvis.length;loop++) {
			elvis[loop].calculateAverageFeedback();
			elvis[loop].calculateGrade();
			elvis[loop].displayInfo();
			System.out.println();
		}
		
	}

}
