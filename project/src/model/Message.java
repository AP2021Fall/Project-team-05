package model;

public class Message {
    User user;
    String text;

    public Message(User user, String text) {
        this.user = user;
        this.text = text;
    }
}
