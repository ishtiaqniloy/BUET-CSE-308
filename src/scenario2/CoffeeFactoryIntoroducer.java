package scenario2;

public class CoffeeFactoryIntoroducer {
    private static CoffeeFactory factory = null;
    CoffeeFactoryIntoroducer(){
        factory = new CoffeeFactory();
    }

    public static CoffeeFactory getFactory(){
        if (factory==null){
            factory = new CoffeeFactory();
        }
        return factory;
    }

}
