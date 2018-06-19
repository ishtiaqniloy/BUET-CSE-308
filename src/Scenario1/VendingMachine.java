package Scenario1;

import java.util.Hashtable;

public class VendingMachine {

    Hashtable <Product, Integer> inventory;

    public VendingMachine() {
        inventory = new Hashtable <Product, Integer> ();
    }
}
