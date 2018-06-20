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

    boolean remove(int stdID){
        if (observers.containsKey(stdID)){
            observers.remove(stdID);
            System.out.println("Observer removed from batch " + batchNo);
            return true;
        }

        return false;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    public void notifyAllObservers(){
        for ( MessageObserver ob : observers.values() ) {
            ob.update();
        }
    }

}
