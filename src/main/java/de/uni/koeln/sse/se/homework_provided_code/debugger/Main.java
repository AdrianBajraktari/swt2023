package de.uni.koeln.sse.se.homework_provided_code.debugger;

public class Main {
	public static void main(String[] args) {
		debuggingExercise1_2();
	}

	public static void debuggingExercise1_2() {
		ShoppingBasket johnShoppingBasket = new ShoppingBasket();
		johnShoppingBasket.addTobasket("Bread");
		johnShoppingBasket.addTobasket("water");
	    System.out.println("john bill : " + johnShoppingBasket.getBill());
	    
	    ShoppingBasket saraShoppingBasket= new ShoppingBasket();
	    saraShoppingBasket.addTobasket("Pasta");
	    saraShoppingBasket.addTobasket("Milk");
	    System.out.println("sara bill : " + saraShoppingBasket.getBill());
	}
}
