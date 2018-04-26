package Scenario1;
public class Scenario1_TakeoutBurger {


    public static void main(String []args){
        System.out.println("Takeout order console");

        Waiter waiter1 = new Waiter();

        BurgerBuilder chickenBurger = new ChickenBurger();
        BurgerBuilder beefBurger = new BeefBurger();

        waiter1.prepareBurger(chickenBurger);
        Burger burger1 = chickenBurger.getBurger();
        burger1.show();

        waiter1.prepareBurger(beefBurger);
        Burger burger2 = beefBurger.getBurger();
        burger1.show();

    }
}
