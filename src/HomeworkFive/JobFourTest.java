package HomeworkFive;

import HomeworkFive.MyServ.MyAnnotation;
import HomeworkFive.MyServ.MyService;

public class JobFourTest {

	public static void main(String[] args) {
			
			
		if (MyService.class.isAnnotationPresent(MyAnnotation.class) == false) {
			
			MyService myService = new MyService ();
			
		
			String catName = "Вася";
			int catWeight = 2;
			String catVote1 = "Кот мяукает";
		
			myService.equals();
			myService.hCode(catVote1);
			myService.thisClassInfo(catName,catWeight,catVote1);
			
		}
		else System.out.println ("Конец программы");
	}

}
