package HomeworkThree;
import java.util.Scanner;
public class LessonFourJobOne {
	public static void main (String args []) {
				
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the character string  ");
		String b = a.nextLine();
		
	
	int sum = 0, x;
	StringBuilder builder = new StringBuilder(); // �������� ������ �������
	char [] y = b.toCharArray();  // ����������� ��� ������ � ����� ������ ��������.
	// ����������: ����� ���������� ������ ��������, ����� �������� �������� ������ ���� ������
	// � ���������� ������� ����������������, ����� ��������� ������������������ ��������,
	// �������������� ���� �������.
		for (int i = 0; i < y.length; i++) {
		if (Character.isDigit(y[i])) {             // ����������, �������� �� ��������� ������ ������
			x = Character.getNumericValue(y[i]);  //���������� �������� int, ������� ������������ ��������� ������
			sum += x;
		}
		if (Character.isLetter(y[i])){        // ����������, �������� �� ��������� ������ ������.
			builder.append(y[i]);            //��������� ������� ������ (������?)
		}
	}
		a.close();
	System.out.println ("Sum of digits in a row  " + sum);
	System.out.println ("String  " +  builder.toString());
	
	}
}