package com.earth.runner;

import java.util.ArrayList;

public class TheIslands {
	
	public void theIslandsX () {
		System.out.print ("���������� ������� ������� �����: ");
	}
	public void theIslandsY () {
		ArrayList <String> theIslands = new ArrayList<>();
		theIslands.add (" ����������, ");
		theIslands.add (" ����� ������, ");
		theIslands.add (" ����������, ");
		theIslands.add (" �������� �����,");
		theIslands.add (" �������, ");
		theIslands.add (" ����������");
		
		for (int i = 0; i < theIslands.size(); i++)
		    System.out.print(theIslands.get(i));
		System.out.println (" ");
	}
}
