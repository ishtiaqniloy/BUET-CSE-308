package ChatRoom;

public class Client {
    public static void main(String [] args){
        Server s = new Server();

        Colleague c1 = new Colleague(s, "Colleague1");
        Colleague c2 = new Colleague(s, "Colleague2");
        Colleague c3 = new Colleague(s, "Colleague3");

        Friend f1 = new Friend(s, "Friend1");
        Friend f2 = new Friend(s, "Friend2");
        Friend f3 = new Friend(s, "Friend3");
        s.addColleague(c1);
        s.addColleague(c2);
        s.addColleague(c3);

        s.addFriend(f1);
        s.addFriend(f2);
        s.addFriend(f3);

        c1.send("AHello World");
        f1.send("CHello2");





    }
}
