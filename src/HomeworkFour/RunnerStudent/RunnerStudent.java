package HomeworkFour.RunnerStudent;

import java.util.ArrayList;

import HomeworkFour.RunnerStudent.Student.Studentxxx;

public class RunnerStudent {
	
	public static void main(String[] args) {
				
	ArrayList <Studentxxx> Student = new ArrayList <>();
	
	InformationAboutStudents IAS = new InformationAboutStudents ();
	
	IAS.infoAboutStudents();
	
	IAS.CourseStudents(Student);
		
	}
}
