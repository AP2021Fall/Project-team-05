package model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private String email;
    private int scores;
    private String userRole;
    private List<User> users = new ArrayList<>();
    private List<String> emails = new ArrayList<>();

    public User (String username , String password , String email){
        this.username = username;
        this.password = password;
        this.email = email;
        users.add(this);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public List<User> getUsersByUsername() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.email = email;
    }
}
