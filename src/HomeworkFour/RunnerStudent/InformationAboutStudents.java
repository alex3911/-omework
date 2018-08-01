package HomeworkFour.RunnerStudent;

import java.util.ArrayList;

import HomeworkFour.RunnerStudent.Student.Student001;
import HomeworkFour.RunnerStudent.Student.Student002;
import HomeworkFour.RunnerStudent.Student.Student003;
import HomeworkFour.RunnerStudent.Student.Student004;
import HomeworkFour.RunnerStudent.Student.Student005;
import HomeworkFour.RunnerStudent.Student.Student006;
import HomeworkFour.RunnerStudent.Student.Student007;
import HomeworkFour.RunnerStudent.Student.Student008;
import HomeworkFour.RunnerStudent.Student.Student009;
import HomeworkFour.RunnerStudent.Student.Student010;
import HomeworkFour.RunnerStudent.Student.Studentxxx;


public class InformationAboutStudents {
	
	
	public void infoAboutStudents () {
		
		Student001 Student001 = new Student001 ();
		Student002 Student002 = new Student002 ();
		Student003 Student003 = new Student003 ();
		Student004 Student004 = new Student004 ();
		Student005 Student005 = new Student005 ();
		Student006 Student006 = new Student006 ();
		Student007 Student007 = new Student007 ();
		Student008 Student008 = new Student008 ();
		Student009 Student009 = new Student009 ();
		Student010 Student010 = new Student010 ();
		
		ArrayList <Studentxxx> Student = new ArrayList <>();
		
		Student.add(Student001);
		Student.add(Student002);
		Student.add(Student003);
		Student.add(Student004);
		Student.add(Student005);
		Student.add(Student006);
		Student.add(Student007);
		Student.add(Student008);
		Student.add(Student009);
		Student.add(Student010);
		
		for (int i = 0; i < Student.size(); i++){
		
		System.out.println("Фамилия студента " + Student.get(i).getName() + "  Курс студента " + Student.get(i).getCourse());
				
				}
		CourseStudents ( Student );
		    	}

	public void CourseStudents (ArrayList<Studentxxx> Student) {
		
		
					
		for (int i = 0; i < Student.size(); i++){
			if (Student.get(i).getCourse() == 2){
				
					
			System.out.println ("Фамилии студентов второго курса " + Student.get(i).getName());
		}	
	}
 }

}
