package scenario2;

public class CoffeeFactory {
    Coffee prepareCoffee(String type){
        Coffee coffee = null;

        if(type==null){
            return coffee;
        }

        else if(type.equalsIgnoreCase("A")){
            coffee = new CoffeeA();
        }
        else if(type.equalsIgnoreCase("B")){
            coffee = new CoffeeB();
        }
        else if(type.equalsIgnoreCase("C")){
            coffee = new CoffeeC();
        }

        return coffee;
    }

}
