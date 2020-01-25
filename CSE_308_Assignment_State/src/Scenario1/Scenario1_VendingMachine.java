package Scenario1;

import java.util.Scanner;

public class Scenario1_VendingMachine {
    public static void main(String []args){
        VendingMachine vendingMachine = new VendingMachine();

        DeliverNoChange deliverNoChange = new DeliverNoChange();
        DeliverWithChange deliverWithChange = new DeliverWithChange();
        NotDeliverInsufficientDeposit notDeliverInsufficientDeposit = new NotDeliverInsufficientDeposit();
        NotDeliverProductDepleted notDeliverProductDepleted = new NotDeliverProductDepleted();

        Scanner scanner = new Scanner(System.in);
        int ch=0;

        while(ch!='q'){
            System.out.println("1.Add New Product 2.Insert Item 3.See Inventory 4.Get Item 5.Quit");
            ch = scanner.nextInt();

            if(ch==1){
                System.out.print("Enter Product Name and Product Price: ");
                String productName = scanner.next();
                int productPrice = scanner.nextInt();

                vendingMachine.addNewProduct(productName, productPrice);

            }
            else if (ch==2){
                System.out.print("Enter Product Name and Number of Items to add: ");
                String productName = scanner.next();
                int productNum = scanner.nextInt();

                vendingMachine.insertItem(productName, productNum);
            }
            else if (ch==3){
                vendingMachine.printInventory();
            }
            else if (ch==4){
                System.out.print("Enter Product Name and Coin Value: ");
                String productName = scanner.next();
                int coin = scanner.nextInt();

                Product product = vendingMachine.getProductInfo(productName);
                Context context = new Context(productName, coin, vendingMachine);

                if(product==null){
                    System.out.println("No such product available");
                }
                else if(product.num<=0){
                    notDeliverProductDepleted.doAction(context);
                    context.printState();
                }
                else if(coin<product.price){
                    notDeliverInsufficientDeposit.doAction(context);
                    context.printState();
                }
                else if(coin>product.price){
                    deliverWithChange.doAction(context);
                    context.printState();
                }
                else {
                    deliverNoChange.doAction(context);
                    context.printState();
                }



            }
            else if (ch==5){
                System.out.println("Exiting...");
                break;
            }
            else{
                System.out.println("Invalid Choice");
            }

            System.out.println();

        }


    }
}
