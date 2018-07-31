package com.flowers;

import com.flowers.cultural.lily;
import com.flowers.cultural.narcissus;
import com.flowers.cultural.rose;
import com.flowers.meadow.celandine;
import com.flowers.meadow.chamomile;
import com.flowers.meadow.cornflower;


public abstract class flowerBouquet  implements bouquet {
	
	Flowers chamomile = new chamomile ();
	Flowers cornflower = new cornflower ();
	Flowers celandine = new celandine ();
	Flowers rose = new rose ();
	Flowers lily = new lily ();
	Flowers narcissus = new narcissus ();
	
	public void value(chamomile chamomile,cornflower cornflower,
			com.flowers.meadow.celandine celandine, com.flowers.cultural.rose rose, com.flowers.cultural.lily lily,
			com.flowers.cultural.narcissus narcissus) {
		double a = chamomile.getsize() + cornflower.getsize() + celandine.getsize() + rose.getsize() + lily.getsize() + narcissus.getsize();
		System.out.print("Цена букета равна  " + a);
		
			}
	@Override
	public void freshness(com.flowers.meadow.chamomile chamomile, com.flowers.meadow.cornflower cornflower,
			com.flowers.meadow.celandine celandine, com.flowers.cultural.rose rose, com.flowers.cultural.lily lily,
			com.flowers.cultural.narcissus narcissus) {
		
		
	}
	@Override
	public void length(com.flowers.meadow.chamomile chamomile, com.flowers.meadow.cornflower cornflower,
			com.flowers.meadow.celandine celandine, com.flowers.cultural.rose rose, com.flowers.cultural.lily lily,
			com.flowers.cultural.narcissus narcissus) {
		// TODO Auto-generated method stub
		
	}
	

}
