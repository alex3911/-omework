package com.aircraft.runner;

public class Runner {
	public static void main(String[] args) {
	// Имя которое в данном случае идет после Aircraft по ходу может быть любым	
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
