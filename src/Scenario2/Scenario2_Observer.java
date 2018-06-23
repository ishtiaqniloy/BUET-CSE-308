package Scenario2;

import java.util.Hashtable;
import java.util.Scanner;

public class Scenario2_Observer {
    public static void main(String []args){
        //System.out.println("Hello World");

        int ch;
        Scanner sc = new Scanner(System.in);

        Hashtable<Integer, BatchCR> batchCRs = new Hashtable<Integer, BatchCR>();

        while (true){
            System.out.println("1.Subscribe 2.Unsubscribe 3.New Message 4.Quit");

            ch = sc.nextInt();

            if(ch==1){
                int stdID;
                String email;
                int batchNO;

                System.out.print("Enter stdID, Email Address and BatchNO : ");
                stdID = sc.nextInt();
                email = sc.next();
                batchNO = sc.nextInt();

                //System.out.println(stdID +" " + email + " " + batchNO);

                if(!batchCRs.containsKey(batchNO)){
                    batchCRs.put(batchNO, new BatchCR(batchNO));
                }

                BatchCR batchCR = batchCRs.get(batchNO);
                new Student(stdID, email, batchCR);

//                if (flag){
//                    System.out.println(stdID + " Subscription successful");
//                }
//                else {
//                    System.out.println("Subscription failed");
//                }

            }

            else if(ch==2){
                int stdID;
                int batchNO;

                System.out.print("Enter stdID and BatchNO : ");
                stdID = sc.nextInt();
                batchNO = sc.nextInt();

                if(!batchCRs.containsKey(batchNO)){
                    System.out.println("BatchCR not available");
                }
                else {
                    BatchCR batchCR = batchCRs.get(batchNO);
                    boolean flag = batchCR.remove(stdID);

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

                if(!batchCRs.containsKey(batchNO)){
                    batchCRs.put(batchNO, new BatchCR(batchNO));
                }

                BatchCR batchCR = batchCRs.get(batchNO);

                batchCR.setMessage(message);

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
