package ChatRoom;

import java.util.ArrayList;

public class Server extends ApplicationMediator {
    ArrayList<Friend> friends = new ArrayList<Friend>();
    ArrayList<Colleague> colleagues = new ArrayList<Colleague>();

    public void addColleague(Colleague c) {
        if(!colleagues.contains(c))
            colleagues.add(c);
    }

    public void addFriend(Friend f) {
        if(!friends.contains(f))
            friends.add(f);
    }

    @Override
    public void send(Recipient r, String msg) {
        char ch = msg.charAt(0);

        String properMsg = msg.substring(1);

        if(ch =='F'){
            for (Friend f: friends) {
                if(f!=r)    f.notify(properMsg);
            }

        }
        else if(ch =='C'){
            for (Colleague c: colleagues) {
                if(c!=r)    c.notify(properMsg);
            }

        }
        else if(ch =='A'){
            for (Friend f: friends) {
                if(f!=r)    f.notify(properMsg);
            }
            for (Colleague c: colleagues) {
                if(c!=r)    c.notify(properMsg);
            }

        }
        else{
            System.out.println("Message not written properly");
        }



    }
}
