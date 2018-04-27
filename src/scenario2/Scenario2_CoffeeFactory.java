package scenario2;
public class Scenario2_CoffeeFactory {
    public static void main(String []args){
        System.out.println("Coffee Factory");

        CoffeeFactory factory = CoffeeFactoryIntroducer.getFactory();

        Coffee coffee1 = factory.prepareCoffee("A");
        coffee1.addComponents();

        Coffee coffee2 = factory.prepareCoffee("B");
        coffee2.addComponents();

        Coffee coffee3 = factory.prepareCoffee("C");
        coffee3.addComponents();


    }



}
