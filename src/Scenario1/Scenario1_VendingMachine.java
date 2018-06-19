package Scenario1;

public class Scenario1_VendingMachine {
    public static void main(String []args){
        System.out.println("Hello World");

        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.addNewProduct("pepsi", 10);
        vendingMachine.insertItem("pepsi", 5);
        vendingMachine.printInventory();


    }
}
