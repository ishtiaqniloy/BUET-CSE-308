package Online1;

public class Director {

    IStudent student;

    public void constructResult(IStudent st){
        student = st;

        student.setMark1();
        student.setMark2();
        student.setMark3();

    }



}
