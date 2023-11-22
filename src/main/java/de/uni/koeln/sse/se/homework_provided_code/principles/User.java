package de.uni.koeln.sse.se.homework_provided_code.principles;

import java.util.ArrayList;
import java.util.List;

public class User {
    private List<Medium> inventory = new ArrayList<>();

    public void addInventory(Medium medium) {
        this.inventory.add(medium);
    }

    public boolean canRent() {
        return this.inventory.size() <= 5;
    }
    //...
}

