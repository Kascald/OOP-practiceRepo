package com.restaurant;

import java.util.Objects;

public class Cook {

	private final String name;
	private final int price;
	public Cook(String menuName, int price) {
		this.name = menuName;
		this.price = price;
	}

	public Cook(MenuItem menuItem) {
		this.name = menuItem.getName();
		this.price = menuItem.getPrice();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cook cook)) return false;
		return price == cook.price && Objects.equals(name, cook.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
}
