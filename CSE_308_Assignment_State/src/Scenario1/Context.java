package Scenario1;

public class Context {
    State state;

    String productName;
    int coinInserted;
    VendingMachine vendingMachine;

    public Context(String name, int coin, VendingMachine v) {
        productName = name;
        coinInserted = coin;
        vendingMachine = v;

        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    void printState(){
        System.out.println("Context State : " + state);
    }
}
