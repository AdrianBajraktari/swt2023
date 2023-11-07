package de.uni.koeln.sse.se.homework_provided_code.refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class RefactoringExample {
    private Vector<Order> orders = new Vector<>();
    private String _name = "John Doe";

    void printOwing(double amount) {
        Enumeration<Order> e = orders.elements();
        double outstanding = 1.2 * amount;

        // print banner
        System.out.println("**********************");
        System.out.println("*** Customer owes ****");
        System.out.println("**********************");

        // calculate outstanding
        while (e.hasMoreElements()) {
            Order each = e.nextElement();
            outstanding += each.getAmount();
        }

        // print details
        System.out.println("name"+ _name);
        System.out.println("amount"+ outstanding);
    }

    private static class Order {
        public double getAmount() {
            return 1;
        }
    }
}
