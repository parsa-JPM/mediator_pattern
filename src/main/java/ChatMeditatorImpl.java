import java.util.ArrayList;
import java.util.List;

public class ChatMeditatorImpl implements ChatMediator {

    private List<User> users;

    public ChatMeditatorImpl() {
        this.users = new ArrayList<User>();
    }

    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            //message should not be received by the user sending it
            if (u != user) {
                u.receive(msg);
            }
        }
    }

    public void addUser(User user) {
        users.add(user);
    }
}
