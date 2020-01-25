package ChatRoom;

public class Colleague extends Recipient {

    public Colleague(ApplicationMediator m, String n) {
        super(m);
        name = n;
    }

    public void send(String msg){
        mediator.send(this, msg);

    }
    public void notify(String msg){
        System.out.println( "Colleague " + name + " receives message : " + msg);
    }
}
