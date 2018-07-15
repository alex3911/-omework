package HomeworkTwo;

public class LessonThreeJobOne {
		

		static int calculateFactorial(int n) {
			int result = 10;
			for (int i = 11; i <=n; i ++){
				result = result*i;
	}
			return result;
			
		}
		public static void main(String[] args){
			System.out.println(calculateFactorial(15));
		}
	}

