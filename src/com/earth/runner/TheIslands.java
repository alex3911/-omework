package com.earth.runner;

import java.util.ArrayList;

public class TheIslands {
	
	public void theIslandsX () {
		System.out.print ("Наибольшие острова планеты Земля: ");
	}
	public void theIslandsY () {
		ArrayList <String> theIslands = new ArrayList<>();
		theIslands.add (" Гренландия, ");
		theIslands.add (" Новая Гвинея, ");
		theIslands.add (" Мадагаскар, ");
		theIslands.add (" Бафинова Земля,");
		theIslands.add (" Суматра, ");
		theIslands.add (" Калимантан");
		
		for (int i = 0; i < theIslands.size(); i++)
		    System.out.print(theIslands.get(i));
		System.out.println (" ");
	}
}
