package HomeworkFive;

import java.util.ArrayList;
import java.util.Random;
import java.util.Calendar;
import java.util.Iterator;
import HomeworkFive.User.User;

public class JobTwoUser {
	
	public static void main(String[] args) {
//???????		
		ArrayList<User> users1 = new ArrayList<User>();
		ArrayList<User> users2 = new ArrayList<User>();
		ArrayList<User> users3 = new ArrayList<User>();
//??????? ?????? ????		
		String[] names = {"????","????","????","????","???","????","????","????","?????"};
		
		Random rand = new Random();
//??????????		
		int n;
		int age;
		int day;
		int month;
		int year;
		Calendar c = Calendar.getInstance(); //???? ???????? ???????? ?????
//?????????? ?????????? ????????? ????????
		for (int i = 0; i < 100000; i++) {
			n = rand.nextInt(names.length);
			age = 1 + rand.nextInt(50);
			day = rand.nextInt(30);
			month = rand.nextInt(12);
			year = c.get(Calendar.YEAR) - age;
//? ??????? ?????? user ??????????? ????? users1 ? users2 
			User user = new User(names[n], age, day, month, year);
			if (i < 50000) {
				users1.add(user);
			} else {
				users2.add(user);
			}
		}
//? ??????? ??????? Iterator ????????? ???????????? ? ????????? ????????? ? ?????? ?????????		
		
		Iterator users2It = users2.iterator();
		for (User i : users1) {
			if (i.toString().equals(users2It.next().toString())) {	//????? equals() ?????????? ?????????? ???????? ? ??????? ???????? ???? boolean true, ???? ?????????? ????????????, ? false ? ???? ???.
				users3.add(i);
			}
		}
		int count = 0;
		for (User i : users3) {
			System.out.println(i);
			count++;
		}
		System.out.println(count);
	}

}