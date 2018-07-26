package com.earth.runner;

import java.util.ArrayList;

public class Ocean {
	public void planetEarth () {
		System.out.print ("Океаны планеты Земля: ");
	}
	
	public void ocean () {
ArrayList <String> ocean = new ArrayList<>();

ocean.add (" Тихий, ");
ocean.add (" Атлантический, ");
ocean.add (" Индийский, ");
ocean.add (" Северный Ледовитый ");

for (int i = 0; i < ocean.size(); i++)
    System.out.print(ocean.get(i));
System.out.println (" ");
	}
}
