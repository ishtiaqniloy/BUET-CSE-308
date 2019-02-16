package Online1;

import java.util.Scanner;

public class MSStudent  implements IStudent{
    Result result;
    Scanner sc;

    MSStudent(){
        result = new Result();
        sc = new Scanner(System.in);
    }

    @Override
    public void setMark1() {
        System.out.printf("Give Assignment Marks: ");
        int mark = sc.nextInt();

        float perMark = (float) (1.0*mark*30.0/50.0);

        result.add(perMark);

    }

    @Override
    public void setMark2() {

        System.out.printf("Give Presentation Marks: ");
        int mark = sc.nextInt();

        float perMark = (float) (1.0*mark*15.0/50.0);

        result.add(perMark);
    }

    @Override
    public void setMark3() {
        System.out.printf("Give Final Exam Marks: ");
        int mark = sc.nextInt();

        float perMark = (float) (1.0*mark*55.0/50.0);

        result.add(perMark);
    }

    @Override
    public Result getResult() {
        return result;
    }
}
