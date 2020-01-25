package Online1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.exit;

public class UGStudent implements IStudent{
    Result result;
    Scanner sc;

    UGStudent(){
        result = new Result();
        sc = new Scanner(System.in);
    }

    @Override
    public void setMark1() {
        ArrayList <Integer> ctMarks = new ArrayList<Integer>();

        System.out.printf("Number of Class tests (Minimum 3) ? ");

        int n = sc.nextInt();

        if(n<3){
            System.out.println("Invalid Input");
            exit(0);
        }

        System.out.println("Provide CT marks :");

        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            ctMarks.add(m);

        }
        Collections.sort(ctMarks);

        float marks = 0;

        for(int i=n-3; i<n; i++){
            //System.out.println(ctMarks.get(i));
            marks+= ctMarks.get(i);
        }

        float perMark = marks/3;

        result.add(perMark);

    }

    @Override
    public void setMark2() {
        System.out.printf("Give Attendance Marks: ");
        int mark = sc.nextInt();

        result.add(mark);
    }

    @Override
    public void setMark3() {
        System.out.printf("Give Term-Final Marks: ");
        int mark = sc.nextInt();

        float perMark = (float) (1.0*mark*70.0/210.0);

        result.add(perMark);
    }

    @Override
    public Result getResult() {
        return result;
    }
}
