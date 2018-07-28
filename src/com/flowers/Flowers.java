package com.flowers;

import com.flowers.cultural.lily;
import com.flowers.cultural.narcissus;
import com.flowers.cultural.rose;
import com.flowers.meadow.celandine;
import com.flowers.meadow.chamomile;
import com.flowers.meadow.cornflower;

public class Flowers implements bouquet {
	
	int size = 20;
	double value = 15.5;
	boolean freshness = true;
	String name = "Name";

	public int getsize () {
		return size;
		}

		public void setsize (int size) {
		this.size = size;
		}
		
		public double getvalue () {
		return value;
		}

		public void setvalue (double value) {
		this.value = value;
		}
		
		public boolean freshness () {
			return freshness;
			}
			public void freshness (boolean freshness) {
			this.freshness = freshness;
			}
			
		public String getname () {
		return name;
		}

		public void setname (String name) {
		this.name = name;
		}

		@Override
		public void value(chamomile chamomile, cornflower cornflower, celandine celandine, rose rose, lily lily,
				narcissus narcissus) {
			double a = chamomile.getsize() + cornflower.getsize() + celandine.getsize() + rose.getsize() + lily.getsize() + narcissus.getsize();
			System.out.print("Цена букета равна  " + a);
			
		}

		@Override
		public void freshness(chamomile chamomile, cornflower cornflower, celandine celandine, rose rose, lily lily,
				narcissus narcissus) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void length(chamomile chamomile, cornflower cornflower, celandine celandine, rose rose, lily lily,
				narcissus narcissus) {
			// TODO Auto-generated method stub
			
		}

		
}
