package Scenario1;

public class DeliverWithChange implements State {
    @Override
    public void doAction(Context context) {
        context.vendingMachine.deliverItem(context.productName);
        System.out.println("Change = " + (context.vendingMachine.getProductInfo(context.productName).price-context.coinInserted) );

        context.setState(this);
    }

    @Override
    public String toString() {
        return "DeliverWithChange State";
    }
}
