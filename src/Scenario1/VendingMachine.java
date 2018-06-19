package Scenario1;

import java.util.Hashtable;

public class VendingMachine {

    Hashtable <String, Product> inventory;

    public VendingMachine() {
        inventory = new Hashtable <String, Product> ();
    }

    boolean addNewProduct(String name, int price){
        Product product = new Product(name, price,0);

        if(inventory.containsKey(name)){
            System.out.println("Product already present");
            return false;
        }

        else {
            inventory.put(name, product);
            System.out.println("New Product added to inventory");
            return true;
        }

    }

    boolean insertItem(String name, int num){
        if(!inventory.containsKey(name)){
            System.out.println("Product not present");
            return false;
        }

        else{
            Product product = inventory.get(name);
            product.num = product.num+num;
            inventory.replace(name, product);
            System.out.println("Items Inserted");
            return true;
        }

    }

    Product getProductInfo(String name){
        return inventory.get(name);
    }

    void printInventory(){
        System.out.println("***Printing Inventory***");
        for (String name: inventory.keySet() ) {
            Product product = inventory.get(name);

            System.out.println(product);
        }

    }

    boolean deliverItem(String name){
        if(!inventory.containsKey(name)){
            System.out.println("Product not present");
            return false;
        }

        else{
            Product product = inventory.get(name);
            product.num = product.num-1;
            inventory.replace(name, product);

            System.out.println("Item delivered");
            return true;
        }
    }


}
