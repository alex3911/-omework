package HomeworkOne;

public class LessonTwoJobOne {
	public static void main (String args []) {
		int sec = 4500;
		int min = sec/60;
		int secRest = sec%60;
		int hr = sec/60/60;
		int minRest = min%60;
		int day = hr/24;
		int week = day/7;
				
		System.out.println(min + " minutes and " + secRest + " seconds.");
		System.out.println(hr + " hour and " + minRest +" minutes and " + secRest + " seconds." );
		System.out.println(day + " days and " + hr + " hour and " + minRest +" minutes and " + secRest + " seconds." );
		System.out.println(week + " week and " + day + " days and " + hr + " hour and " + minRest +" minutes and " + secRest + " seconds." );
	}
}
