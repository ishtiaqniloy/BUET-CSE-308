package Online1;

public class Result {
    float perMark;

    Result(){
        perMark = 0;
    }

    void add(float mark){
        perMark+=mark;
    }

    void show(){
        System.out.println("Percentage of Mark = " + perMark);

        System.out.printf("Letter Grade = ");
        if (perMark>=80){
            System.out.println("A+");
        }
        else if (perMark>=70){
            System.out.println("A");
        }
        else if (perMark>=60){
            System.out.println("B");
        }
        else if (perMark>=50){
            System.out.println("C");
        }
        else{
            System.out.println("F");
        }



    }

}
