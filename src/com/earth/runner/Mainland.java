package com.earth.runner;

import java.util.ArrayList;

public class Mainland {
	
	public void planetM () {
		System.out.print ("�������� ������� �����: ");
	}

	public void mainlandM () {
		ArrayList <String> mainland = new ArrayList<>();
		mainland.add (" �������, ");
		mainland.add (" ������, ");
		mainland.add (" �������� �������, ");
		mainland.add (" ����� �������, ");
		mainland.add (" ���������, ");
		mainland.add (" ���������� ");
		
		for (int i = 0; i < mainland.size(); i++)
		    System.out.print(mainland.get(i));
		System.out.println (" ");
	}
}
