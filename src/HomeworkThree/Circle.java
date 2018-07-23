package HomeworkThree;
import java.util.Scanner;
import java.util.Random;
public class Circle {
	public static int x2;// ќбъ€вить переменные x1, x2, x3, y1, y2, y3 
	public static int x3;
	public static int y2;
	public static int y3;
	public int r;
	public double s;
	public static double x1;
	public static double y1;
	
	public static void main(String[] args) {
		
		System.out.println ("¬ведите радиус окружности");
		Scanner sc = new Scanner(System.in);
		double a = sc .nextDouble (); // a  радиус окружности.
		double cl = CircleLength(a);
		double dc = DistCirc();
		
		System.out.println ("ƒлинна окружности равна   " + cl);		
		System.out.println (RandCirc ());
		System.out.println ("–асто€ние между центрами двух окружностей  " + dc);
	}
	public static double CircleLength(double a) {
		double y1 = Math.PI;
		double x1 = 2*y1*a;
		return x1;
	}
		
	// x2, y2 - координаты круга 1, x3, y3 -  координаты круга 2, r - радиус круга 2
	// ¬водим координаты и радиус через в метод через скан
	public static int RandCirc () {
		
				Random rand = new Random();
		int x2 = -99 + rand.nextInt(198);
		int y2 = -99 + rand.nextInt(198);
		
		System.out.println ("¬ведите радиус второй окружности");
		Scanner b = new Scanner(System.in);
		int r = b.nextInt();
		System.out.println ("¬ведите координаты по x");
		Scanner d = new Scanner(System.in);
		int x3 = d.nextInt();
		System.out.println ("¬ведите координаты по y");
		Scanner f = new Scanner(System.in);
		int y3 = f.nextInt();
		return r;
	}
	
	public static double DistCirc () {
		int c = 2;
		double s = Math.sqrt (Math.pow((x3-x2), c) + Math.pow((y3 - y2), c));		
//		double s = 15.5;
		return s;
		
	}
	
	
	
	
	}
	

	

