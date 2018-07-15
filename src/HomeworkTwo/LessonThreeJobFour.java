package HomeworkTwo;

import java.util.Random;

public class LessonThreeJobFour {
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		int  m = rand.nextInt(10);
		int  n = rand.nextInt(10);
		int [][] a = new int [n][m];
		
		for (int i = 0; i < n ; i ++) {
		for (int j = 0; j < m; j++) {
		a [i][j] = rand.nextInt(5);
		
		System.out.print (a[i][j] + "  ");

		}
		System.out.println ();
		
				}
		int max = a[0][0];
		int x = 0, y = 0;
		for (int i = 0; i < a.length ; i ++) {
			for (int j = 0; j < a[i].length; j++) {
				if (max  < a[i][j]){
				max = a[i][j];
		x = i;
		y = j;
				}
		}
		
}
		System.out.println ("Maximum number in array  " + max);
		System.out.println ("Position in the array [" + x + "][" + y + "]");
		System.out.println ("The first position in the array " + a[0][0]);
		System.out.println ("The last cell of the array " + a[n-1][m-1]);
}
}
