package Scenario2;

import java.util.Hashtable;
import java.util.Scanner;

public class Scenario2_Observer {
    public static void main(String []args){
        System.out.println("Hello World");

        int ch;
        Scanner sc = new Scanner(System.in);

        Hashtable<Integer, Batch> batches = new Hashtable<Integer, Batch>();

        while (true){
            System.out.println("1.Subscribe 2.Unsubscribe 3.New Message 4.Quit");

            ch = sc.nextInt();

            if(ch==1){
                int stdID;
                int batchNO;

                System.out.print("Enter stdID and BatchNO : ");
                stdID = sc.nextInt();
                batchNO = sc.nextInt();

                if(!batches.containsKey(batchNO)){
                    batches.put(batchNO, new Batch(batchNO));
                }

                Batch batch = batches.get(batchNO);
                boolean flag = batch.attach(stdID, new Student(stdID, batch));

                if (flag){
                    System.out.println(stdID + " Subscription successful");
                }
                else {
                    System.out.println("Subscription failed");
                }

            }

            else if(ch==2){
                int stdID;
                int batchNO;

                System.out.print("Enter stdID and BatchNO : ");
                stdID = sc.nextInt();
                batchNO = sc.nextInt();

                if(!batches.containsKey(batchNO)){
                    System.out.println("Batch not available");
                }
                else {
                    Batch batch = batches.get(batchNO);
                    boolean flag = batch.remove(stdID);

                    if (flag){
                        System.out.println(stdID + " Unsubscribe successful");
                    }
                    else {
                        System.out.println("Unsubscribe failed");
                    }
                }


            }
            else if(ch==3){
                int batchNO;
                String message;

                System.out.print("Enter BatchNO and Message : ");
                batchNO = sc.nextInt();
                message = sc.next();

                if(!batches.containsKey(batchNO)){
                    batches.put(batchNO, new Batch(batchNO));
                }

                Batch batch = batches.get(batchNO);

                batch.setMessage(message);

            }
            else if(ch==4){
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
