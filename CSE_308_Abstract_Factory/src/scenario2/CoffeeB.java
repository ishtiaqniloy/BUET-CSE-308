package scenario2;

public class CoffeeB implements Coffee{
    @Override
    public void addComponents(){
        System.out.println("\nCoffee type B:");
        System.out.println("Hot water taken");
        System.out.println("Coffee added");
        System.out.println("Milk added");
    }

}
