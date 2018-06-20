package Scenario2;

public class Student extends MessageObserver {
    int stdID;
    String message;

    public Student(int stdID, Batch batch) {
        this.batch = batch;
        batch.attach(stdID, this);

        this.stdID = stdID;
        message = null;

    }

    @Override
    public boolean update() {
        this.message = batch.getMessage();

        System.out.println("Message received by " + stdID + " : " + this.message);

        return true;
    }
}
