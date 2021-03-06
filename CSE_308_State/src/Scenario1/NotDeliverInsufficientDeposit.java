package Scenario1;

public class NotDeliverInsufficientDeposit implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Not enough deposit");
        System.out.println("Item not delivered");
        System.out.println("Coin returned");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "NotDeliverInsufficientDeposit State";
    }
}