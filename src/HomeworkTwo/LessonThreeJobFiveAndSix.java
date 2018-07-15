package HomeworkTwo;
import java.util.Random;

public class LessonThreeJobFiveAndSix {
	public static void main(String[] args) {
		Random rand = new Random();
		int  n = rand.nextInt(20);
		int [] a = new int [n];
		for (int i = 0; i < n ; i ++) {
			a [i] = rand.nextInt(1000);			
			System.out.print (a[i] + " ");
			
		}
		
		System.out.println ();
		

		for (int i = 0; i < a.length; i++) {

			if (i < (a.length) / 2) {
				n = a[i];
				a[i] = a[a.length - 1 - i];
				a[a.length - 1 - i] = n;
			}
			System.out.print (a[i] + " ");
		}
		// максимальное число массива
		
		int max = a[0];
		int x = 0;
		for (int i = 0; i < a.length ; i ++) {
			if (max  < a[i]){
				max = a[i];
				x = i;
					}
		}
		
		
		System.out.println ("Maximum number in array  " + max + ", Position in the array [" + x + "]");
		
		
		//минимальное число массива
		
		int min = a[0];
		int y = 0;
		for (int i = 0; i < a.length ; i ++) {
			if ( min > a[i]) {
				min = a[i];
				y = i;
			}
					}
		System.out.println ("The minimum number in the array  " + min + ", The position of the minimum number in the array [" + y + "]");
		
		int sum = 0;
		if (y < x) {
			for (int i = y; i <= x; i++) {
				sum += a[i];
			}
		} 
                         else {
			for (int i = x; i <= y; i++) {
				sum += a[i];
			}
		}
		System.out.println ("Sum of elements between min and max " + sum);
	}
	}
	

