package com.earth.runner;

import java.util.ArrayList;

public class Ocean {
	public void planetEarth () {
		System.out.print ("������ ������� �����: ");
	}
	
	public void ocean () {
ArrayList <String> ocean = new ArrayList<>();

ocean.add (" �����, ");
ocean.add (" �������������, ");
ocean.add (" ���������, ");
ocean.add (" �������� ��������� ");

for (int i = 0; i < ocean.size(); i++)
    System.out.print(ocean.get(i));
System.out.println (" ");
	}
}
