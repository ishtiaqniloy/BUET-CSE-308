package Scenario1;

public class NotDeliverProductDepleted implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("Not enough items in inventory");
        System.out.println("Item not delivered");
        System.out.println("Coin returned");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "NotDeliverProductDepleted State";
    }
}