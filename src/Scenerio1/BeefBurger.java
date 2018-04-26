package Scenerio1;

public class BeefBurger implements BurgerBuilder{
    private Burger burger;

    BeefBurger(){
        burger = new Burger();
    }

    @Override
    public void takeBun(){
        burger.add("Large bun");
    }

    @Override
    public void insertPatty(){
        burger.add("Beef patty");
    }

    @Override
    public void addCheese(){
        burger.add("2 cheese slices");
    }

    @Override
    public void addSauce(){
        burger.add("Regular sauce");
    }

    @Override
    public Burger getBurger(){
        return burger;
    }
}
