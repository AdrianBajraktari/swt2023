package de.uni.koeln.sse.se.debugger;

import java.util.HashMap;

public class Items {
	HashMap<String, Integer> priceMap = new HashMap<String, Integer>();

	public Items() {
		this.priceMap.put("Milk", 2);
		this.priceMap.put("Bread", 1);
		this.priceMap.put("Yoghurt", 1);
		this.priceMap.put("Water", 1);
		this.priceMap.put("Cheese", 3);
		this.priceMap.put("Pasta", 1);
		this.priceMap.put("Shampoo", 3);
		this.priceMap.put("Potato", 2);
	}
    
    public Integer getPrice(String item) {
    	return priceMap.get(item);
    }
}
