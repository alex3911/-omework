package HomeworkThree;
import java.util.Scanner;
public class LessonFourJobFourFive {
	public static void main (String args []) {
		System.out.println ("¬ведите любое предложение");
		
		Scanner a = new Scanner(System.in);
		String b = a.nextLine();
		
		// –ешаем проблему в лоб. ѕодсчитаем количество основных знаков препинани€ (. , - ? ! : ;)
		
		
		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0;

		for (char element : b.toCharArray()){
		if (element == '.') count1++;
		if (element == ',') count2++;
		if (element == '-') count3++;
		if (element == '?') count4++;
		if (element == '!') count5++;
		if (element == ':') count6++;
		if (element == ';') count7++;
		if (element == ' ') count8++;
		}
		System.out.println ("Ќиже выволитс€ последовательно количество точек, зап€тых, тирэ, знаков вопроса и восклицани€, двоеточий, точек с зап€той");
		System.out.println ( count1);
		System.out.println ( count2);
		System.out.println ( count3);
		System.out.println ( count4);
		System.out.println ( count5);
		System.out.println ( count6);
		System.out.println ( count7);
		System.out.println ( count8);
		
		b = b.trim();
		String[] words = b.split("[\\s,.:!?-]+");
	//	 for (String w : words) {
		            
		// }
		a.close();
		        System.out.println("—лов: " + words.length);
		
		
		
	}
}


