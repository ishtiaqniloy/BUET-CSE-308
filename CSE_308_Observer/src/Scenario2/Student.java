package Scenario2;

public class Student extends MessageObserver {
    int stdID;
    String emailAddress;
    String message;

    public Student(int stdID, String email, BatchCR batchCR) {
        this.batchCR = batchCR;
        batchCR.attach(stdID, this);

        this.stdID = stdID;
        this.emailAddress = email;
        message = null;

    }

    @Override
    public boolean update() {
        this.message = batchCR.getMessage();
        System.out.println("Message emailed to " + emailAddress + " for stdID " + stdID + ": " + this.message);

        return true;
    }
}
