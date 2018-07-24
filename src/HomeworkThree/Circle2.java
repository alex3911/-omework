package HomeworkThree;

import java.util.Scanner;
import java.util.Random;

public class Circle2 {
	public static void main(String[] args) {
			// Ввести радиусы и задать координаты центров
		System.out.println ("Ведите радиус 1-ой окружности");
		Scanner a = new Scanner(System.in);
		int r1 = a .nextInt();
		System.out.println ("Ведите радиус 2-ой окружности");
		Scanner b = new Scanner(System.in);
		int r2 = b .nextInt();
		System.out.println ("Ведите координату x первой окружности");
		Scanner c = new Scanner(System.in);
		int x1 = c .nextInt();
		System.out.println ("Ведите координату y первой окружности");
		Scanner d = new Scanner(System.in);
		int y1 = d .nextInt();
		// координаты центра второго круга определяем рандомно
		Random rand = new Random();
		int x2 = -99 + rand.nextInt(198);
		int y2 = -99 + rand.nextInt(198);
		
		double cl = CircleLength(r1);
		System.out.println ("Длинна окружности равна   " + cl);	
		
		double dc = DistCirc (x1, x2, y1, y2);
		System.out.println ("Растояние между центрами окружностей равно  " + dc);
		
		// Ни до чего хорошего я не додумался кроме как создать 2 проверки вместо одной.
	//Итак проверка первая. Verification 
		int vf = Verification (dc, r1, r2);
		if (vf == 0) System.out.println ("Окружности не пересекаются");
		else System.out.println ("Окружности пересекаются");
			}
	

	// Создать метод вычисления длинны окружности
	private static double CircleLength(int r1) {
		double f = Math.PI;
		double g = 2*f*r1;
		return g;
		}
	
	// Создать метод вычисления растояния между центрами окружностей
	private static double DistCirc(int x1, int x2, int y1, int y2) {
		int f = 2;
		double l = Math.sqrt (Math.pow((x2-x1), f) + Math.pow((y2 - y1), f));
		return l;
	}
	
		// Проверка вторая
	private static int Verification (double dc, int r1, int r2) {
		int h;
		if ((r1+r2) < dc & (r1 - r2) > dc) h = 0;
		else h = 1;
		return h;
	}
	}
