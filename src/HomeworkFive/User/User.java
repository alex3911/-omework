package HomeworkFive.User;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class User {
// Переменные
	private String name;
	private int age;
	private Calendar dateOfBirth;
// Метод создающий Юзеров	
	public User (String name, int age, int day, int month, int year) {
		this.name = name;
		this.age = age;
		this.dateOfBirth = new GregorianCalendar(year, month, day);
	}
// Метод возвращающий имя возраст и дату рождения
	public String toString() {
		return "Name: " + this.name + "; age = " + this.age + "; date of birth = " + this.dateOfBirth.getTime();
	}


	
}
