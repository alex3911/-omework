package HomeworkThree;
import java.util.Scanner;
import java.util.Random;
public class LessonFourJobTwo {
	public static void main(String[] args) {
		Random rand = new Random();
	char [] a = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};		
				
    for (int i = 0 ; i <= 2; i++) {
    	int  n = rand.nextInt(25);
    	System.out.println ("������� �������� ����� ����������� ��������");
		Scanner d = new Scanner(System.in);
		char b = d.next().charAt(0);	

	if ( a[n] == b) System.out.println ("�� ��������");

	else System.out.println ("�� ���������. ��������� ��� ���");

	
	d.close();
	}
    System.out.println ("����� ����");
    
		
	}
}
