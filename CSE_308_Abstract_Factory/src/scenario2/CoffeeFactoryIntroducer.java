package scenario2;

public class CoffeeFactoryIntroducer {
    private static CoffeeFactory factory = null;
    CoffeeFactoryIntroducer(){
        factory = new CoffeeFactory();
    }

    public static CoffeeFactory getFactory(){
        if (factory==null){
            factory = new CoffeeFactory();
        }
        return factory;
    }

}
