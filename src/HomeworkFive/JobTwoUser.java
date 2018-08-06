package HomeworkFive;

import java.util.ArrayList;
import java.util.Random;
import java.util.Calendar;
import java.util.Iterator;
import HomeworkFive.User.User;

public class JobTwoUser {
	
	public static void main(String[] args) {
//Объекты		
		ArrayList<User> users1 = new ArrayList<User>();
		ArrayList<User> users2 = new ArrayList<User>();
		ArrayList<User> users3 = new ArrayList<User>();
//Простой массив имен		
		String[] names = {"Саша","Коля","Вася","Сеня","Юра","Влад","Петр","Рома","Федор"};
		
		Random rand = new Random();
//Переменные		
		int n;
		int age;
		int day;
		int month;
		int year;
		Calendar c = Calendar.getInstance(); //Дата текущего часового пояса
//Присвоение переменным рандомных значений
		for (int i = 0; i < 100000; i++) {
			n = rand.nextInt(names.length);
			age = 1 + rand.nextInt(50);
			day = rand.nextInt(30);
			month = rand.nextInt(12);
			year = c.get(Calendar.YEAR) - age;
//С помощью метода user заполняются листы users1 и users2 
			User user = new User(names[n], age, day, month, year);
			if (i < 50000) {
				users1.add(user);
			} else {
				users2.add(user);
			}
		}
//С помощью патерна Iterator коллекции сравниваются и результат заносится в третью коллекцию		
		
		Iterator users2It = users2.iterator();
		for (User i : users1) {
			if (i.toString().equals(users2It.next().toString())) {	//Метод equals() сравнивает содержимое объектов и выводит значение типа boolean true, если содержимое эквивалентно, и false — если нет.
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
