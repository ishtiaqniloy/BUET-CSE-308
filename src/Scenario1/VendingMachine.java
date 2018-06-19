package Scenario1;

import java.util.Hashtable;

public class VendingMachine {

    Hashtable <Product, Integer> inventory;

    public VendingMachine() {
        inventory = new Hashtable <Product, Integer> ();
    }

    boolean addNewProduct(String name, int price){
        Product product = new Product(name, price);

        if(inventory.containsKey(product)){
            System.out.println("Product already present");
            return false;
        }

        else {
            inventory.put(product, 0);
            System.out.println("New Product added to inventory");
            return true;
        }

    }

    boolean insertItem(String name, int num){
        Product product = new Product(name, 0);
        if(!inventory.containsKey(product)){
            System.out.println("Product not present");
            return false;
        }

        else{
            int currnetVal = inventory.get(product);
            inventory.replace(product, currnetVal+num);
            System.out.println("Items Inserted");
            //System.out.println(product.name+inventory.get(product));
            return true;
        }

    }

    void printInventory(){
        System.out.println("***Printing Inventory***");
        for (Product product: inventory.keySet() ) {
            System.out.println("<("+product.name+","+product.price+"):"+inventory.get(product)+">");
            
        }

    }

}
