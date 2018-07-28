package com.flowers;

import com.flowers.cultural.lily;
import com.flowers.cultural.narcissus;
import com.flowers.cultural.rose;
import com.flowers.meadow.celandine;
import com.flowers.meadow.chamomile;
import com.flowers.meadow.cornflower;


public class bouquets {

	public static void main(String[] args) {
		
		Flowers chamomile = new chamomile ();
		Flowers cornflower = new cornflower ();
		Flowers celandine = new celandine ();
		Flowers rose = new rose ();
		Flowers lily = new lily ();
		Flowers narcissus = new narcissus ();
		
		Flowers flowers = new Flowers ();
		flowers.value ();
	}

}
