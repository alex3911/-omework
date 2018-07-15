package HomeworkTwo;
import java.util.Random;
public class LessonThreeJobThree {
	public static void main(String[] args) {
		Random rand = new Random();
	int n = 1 + rand.nextInt(1000);
	int x = 3;
		int sum = 0;
		for (int i = 1; i<=n; i++){
			sum += x*i;
		} 
		System.out.println("Сумма первых " + n + " чисел кратных 3 равна " + sum);
		}
	}

