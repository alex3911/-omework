package HomeworkOne;
import java.util.Random;

public class LessonTwoJobFour {
	public static void main (String args []) {
		Random rand = new Random();
		
		int num = rand.nextInt(1000);
		if (num % 100 >=11 & num % 100 <= 14) System.out.println( num + " рублей ");
		else if (num % 10 == 1) System.out.println( num + " рубль ");
		else if (num % 10 >=2 & num % 10 <= 4) System.out.println( num + " рубля ");
		else System.out.println( num + " рублей ");
		
			
	}
}
