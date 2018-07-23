package HomeworkThree;
import java.util.Scanner;
public class LessonFourJobOne {
	public static void main (String args []) {
				
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the character string  ");
		String b = a.nextLine();
		
	
	int sum = 0, x;
	StringBuilder builder = new StringBuilder(); // Создание нового объекта
	char [] y = b.toCharArray();  // Преобразует эту строку в новый массив символов.
	// Возвращает: новый выделенный массив символов, длина которого является длиной этой строки
	// и содержимое которой инициализируется, чтобы содержать последовательность символов,
	// представленную этой строкой.
		for (int i = 0; i < y.length; i++) {
		if (Character.isDigit(y[i])) {             // Определяет, является ли указанный символ цыфрой
			x = Character.getNumericValue(y[i]);  //Возвращает значение int, которое представляет указанный символ
			sum += x;
		}
		if (Character.isLetter(y[i])){        // Определяет, является ли указанный символ буквой.
			builder.append(y[i]);            //добавляет готовую строку (массив?)
		}
	}
		a.close();
	System.out.println ("Sum of digits in a row  " + sum);
	System.out.println ("String  " +  builder.toString());
	
	}
}