package scenario2;

public class CoffeeC implements Coffee{
    @Override
    public void addComponents(){
        System.out.println("Hot water taken");
        System.out.println("Coffee added");
        System.out.println("Milk added");
        System.out.println("Sugar added");
    }

}
