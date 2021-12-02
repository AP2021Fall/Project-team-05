package model;

public class Comment {
    User user;
    String text;

    public Comment(User user, String text) {
        this.user = user;
        this.text = text;
    }
}
