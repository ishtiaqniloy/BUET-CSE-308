package Scenario2;

import java.util.Hashtable;

public class Batch {
    int batchNo;
    Hashtable <Integer, MessageObserver> observers;
    String message;

    public Batch(int batchNo) {
        this.batchNo = batchNo;
        observers = new Hashtable<Integer, MessageObserver>();
        message = null;
    }

    boolean attach(int stdID, MessageObserver ob){
        if (observers.containsKey(stdID)){
            System.out.println("Already attached");
            return false;
        }

        observers.put(stdID, ob);

        return true;
    }



}
