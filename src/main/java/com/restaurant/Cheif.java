package com.restaurant;

public class Cheif {



	public Cook startCook(MenuItem menuItem) {
		Cook cook = new Cook(menuItem);
		return cook;

///*(1)*/		return new Cook("돈까쓰",6000);
	}
}
