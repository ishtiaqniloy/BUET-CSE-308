package Scenario1;

public class Waiter {
    private BurgerBuilder waiterBurgerBuilder;

    void prepareBurger(BurgerBuilder burgerBuilder){
        waiterBurgerBuilder = burgerBuilder;

        waiterBurgerBuilder.takeBun();
        waiterBurgerBuilder.insertPatty();
        waiterBurgerBuilder.addCheese();
        waiterBurgerBuilder.addSauce();

    }


}
