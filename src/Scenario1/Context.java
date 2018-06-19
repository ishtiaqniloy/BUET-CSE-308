package Scenario1;

public class Context {
    State state;

    String productName;
    int coinInserted;

    public Context(String name, int coin) {
        productName = name;
        coinInserted = coin;
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
