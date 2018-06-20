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
        observers.clear();
    }

    boolean attach(int stdID, MessageObserver ob){
        //System.out.println("Attach Called");
        if (observers.containsKey(stdID)){
            //ob = observers.get(stdID);
            //System.out.println("stdID = " + ((Student)ob).stdID + " Batch = "  + ((Student)ob).batch.batchNo );
            System.out.println("Already attached");
            return false;
        }
        else {
            observers.put(stdID, ob);
            System.out.println("Subscription Successful");
            return true;

        }
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

//    void print(){
//        System.out.println("***Printing***");
//        for (MessageObserver ob : observers.values()){
//            Student student = (Student) ob;
//
//            System.out.println("<" + student.stdID + "," + student.batch.batchNo + ">");
//        }
//    }

}
