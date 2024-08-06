package com.restaurant;

public class Customer {

	public Cook orderMenu(String menuName , Menu menu , Cheif cheif) {
		MenuItem menuItem = menu.selectMenu(menuName);
		Cook cook = cheif.startCook(menuItem);
		return cook;
	}
}
