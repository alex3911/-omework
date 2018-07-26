package com.earth.runner;

import java.util.ArrayList;

public class Mainland {
	
	public void planetM () {
		System.out.print ("Материки планеты Земля: ");
	}

	public void mainlandM () {
		ArrayList <String> mainland = new ArrayList<>();
		mainland.add (" Евразия, ");
		mainland.add (" Африка, ");
		mainland.add (" Северная Америка, ");
		mainland.add (" Южная Америка, ");
		mainland.add (" Австралия, ");
		mainland.add (" Антарктида ");
		
		for (int i = 0; i < mainland.size(); i++)
		    System.out.print(mainland.get(i));
		System.out.println (" ");
	}
}
