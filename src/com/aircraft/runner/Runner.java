package com.aircraft.runner;

public class Runner {
	public static void main(String[] args) {
	// ��� ������� � ������ ������ ���� ����� Aircraft �� ���� ����� ���� �����	
		Aircraft aircraft = new Aircraft ();
		aircraft.takeoff ();
		
		Engine engine = new Engine ();
		engine.working ();
		
		Chassis chassis = new Chassis ();
		chassis.ChassisCleaned ();
		
		Wing wing = new Wing ();
		wing.XWing();
		
		aircraft.flight();
		
	}
	}
