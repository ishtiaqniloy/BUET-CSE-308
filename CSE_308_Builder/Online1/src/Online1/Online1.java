package Online1;

import java.util.Scanner;

public class Online1 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String sType;

        Director director = new Director();
        IStudent student;
        Result result;

        while (true){

            System.out.println("Provide Student type: UG/MS");
            sType = sc.nextLine();

            if(sType.equalsIgnoreCase("UG")){
                student = new UGStudent();

            }

            else if(sType.equalsIgnoreCase("MS")){
                student = new MSStudent();
            }

            else if (sType.equalsIgnoreCase("exit")){
                return;
            }
            else{
                System.out.println("Invalid String");
                continue;
            }

            director.constructResult(student);

            result = student.getResult();

            result.show();

            System.out.println();


        }







    }


}
