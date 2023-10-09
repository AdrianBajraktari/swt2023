package de.uni.koeln.sse.se.debugger;

import java.util.ArrayList;

public class ShoppingBasket {
	public static Items itemList = new Items();
	private static Integer totalPrice = 0;

	ArrayList<String> myItems = new ArrayList<String>();

	public ShoppingBasket() {

	}
	
	public void addTobasket(String item) {
		setTotalPrice(getTotalPrice() + itemList.getPrice(item));
	}
	
	public Integer getBill() {
		return getTotalPrice();
	}

	public Integer getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Integer totalPrice) {
		ShoppingBasket.totalPrice = totalPrice;
	}
}
