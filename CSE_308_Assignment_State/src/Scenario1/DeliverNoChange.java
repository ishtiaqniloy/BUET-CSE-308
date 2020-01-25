package Scenario1;

public class DeliverNoChange implements State {

    @Override
    public void doAction(Context context) {
        context.vendingMachine.deliverItem(context.productName);
        System.out.println("No change is given");

        context.setState(this);
    }

    @Override
    public String toString() {
        return "DeliverNoChange State";
    }
}
