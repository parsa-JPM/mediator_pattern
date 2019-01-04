public class Client {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMeditatorImpl();
        User parsa = new UserImpl(mediator, "Parsa");
        User asghar = new UserImpl(mediator, "Asghar");
        User delbar = new UserImpl(mediator, "Delbar");

        mediator.addUser(parsa);
        mediator.addUser(delbar);
        mediator.addUser(asghar);

        parsa.send("hello everyone");
    }
}
