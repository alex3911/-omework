package HomeworkTwo;



import java.util.Scanner;

public class LessonThreeJobTwo {
	
	public static void main (String args []) {
				
	Scanner sc = new Scanner(System.in);
	System.out.println("Ведите любое целое число");
	int a = sc.nextInt();
	
	if ((a % 1) == 0 & (a % a) == 0 & (a % 2) > 0 & (a % 3) > 0) System.out.println( "Число простое");
	else System.out.println( "Число не является простым");
	
	
	}
}
