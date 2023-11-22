package de.uni.koeln.sse.se.homework_provided_code.principles;

public class Library {
    //...
    public void rent(Medium medium, User user) {
        if (user.canRent()) {
            user.addInventory(medium);
            medium.setRenter(user);
        } else {
            System.err.println("Sorry, but you can "
                    + "not rent this item");
        }
    }
}
