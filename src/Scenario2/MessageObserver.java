package Scenario2;

public abstract class MessageObserver {
    protected BatchCR batchCR;
    abstract boolean update();
}
