package com.flowers.meadow;

import com.flowers.Flowers;

public class celandine extends Flowers{
	
	private int size = 11;
	private double value = 3.3;
	private boolean freshness = true;
	private String name = "Чистотел";

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
}
