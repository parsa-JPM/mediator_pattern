public class UserImpl extends User {
    public UserImpl(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    /**
     * Notice that send() method is using mediator
     * to send the message to the users and it has no idea how it will be handled by the mediator.
     *
     * @param msg
     */
    public void send(String msg) {
        System.out.println(this.name + " Send this message: " + msg);
        mediator.sendMessage(msg, this);
    }

    public void receive(String msg) {
        System.out.println(this.name + ": Received this message" + msg);
    }
}
