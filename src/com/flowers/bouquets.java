package com.flowers;

import com.flowers.cultural.lily;
import com.flowers.cultural.narcissus;
import com.flowers.cultural.rose;
import com.flowers.meadow.celandine;
import com.flowers.meadow.chamomile;
import com.flowers.meadow.cornflower;
import com.flowers.Flowers;

public class bouquets {

	public static void main(String[] args) {
		
		chamomile chamomile = new chamomile ();
		cornflower cornflower = new cornflower ();
		celandine celandine = new celandine ();
		rose rose = new rose ();
		lily lily = new lily ();
		narcissus narcissus = new narcissus ();
		
		Flowers flowers =new Flowers();
		
		flowers.value (chamomile, cornflower, celandine, rose, lily, narcissus);
	}

}
