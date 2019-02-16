package ChatRoom;


public abstract class Recipient {
    protected ApplicationMediator mediator;
    public String name;

    public Recipient(ApplicationMediator m){
        mediator = m;
     }

}
