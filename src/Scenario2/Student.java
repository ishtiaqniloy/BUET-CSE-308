package Scenario2;

public class Student implements MessageObserver {
    int stdID;
    String message;

    public Student(int stdID) {
        this.stdID = stdID;
        message = null;

    }

    @Override
    public boolean update(String message) {
        this.message = message;

        System.out.println("Message received by " + stdID + " : " + this.message);

        return true;
    }
}
