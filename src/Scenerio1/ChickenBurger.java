package Scenerio1;

public class ChickenBurger implements BurgerBuilder {
    private Burger burger;

    ChickenBurger(){
        burger = new Burger();
    }

    @Override
    public void takeBun(){
        burger.add("Medium sized bun");
    }

    @Override
    public void insertPatty(){
        burger.add("Chicken patty");
    }

    @Override
    public void addCheese(){
        burger.add("1 cheese slide");
    }

    @Override
    public void addSauce(){
        burger.add("Spicy sauce");
    }

    @Override
    public Burger getBurger(){
        return burger;
    }

}
