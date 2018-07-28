package com.flowers.cultural;

import com.flowers.Flowers;

public class lily extends Flowers{
	private int size = 17;
	private double value = 9.7;
	private boolean freshness = true;
	private String name = "Лилия";

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
