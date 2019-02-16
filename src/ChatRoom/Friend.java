package ChatRoom;

public class Friend extends Recipient {

    public Friend(ApplicationMediator m, String n) {
        super(m);
        name = n;
    }

    public void send(String msg){
        mediator.send(this, msg);

    }
    public void notify(String msg){
        System.out.println("Friend " + name + " receives message : " + msg);
    }


}
