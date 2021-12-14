package controller;

import model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogin {

    public static final List<User> users = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);

    private static Pattern loginPattern = Pattern.compile("^login ([\\S]+) ([\\S]+)$");
    private static Pattern signupPattern = Pattern.compile("^create ([\\S]+) ([\\S]+) ([\\S]+) (^[a-zA-Z0-9.]+@(gmail||yahoo).com$)");



    public void run() {
        System.out.println("Welcome to our program! version: 4.2.1");
        System.out.println("please login first");
        System.out.println("valid commands : ");
        System.out.println("login username password");
        System.out.println("don't have any account yet?");
        System.out.println("signup username password password emailAddress)");

        String userCommand;
        while(true) {
            userCommand = scanner.nextLine();
            if(loginPattern.matcher(userCommand).matches()){
                Matcher matcher = loginPattern.matcher(userCommand);
                String username = null;
                String password = null;
                while (matcher.find()) {
                    username = matcher.group(1);
                    password = matcher.group(2);
                }
                if(existUser(username)) {
                    User loginUser = null;
                    for (User user : users) {
                        if(user.getUsername().equals(username)){
                            loginUser = user;
                            break;
                        }
                    }
                    if(loginUser.getPassword().equals(password)){
                        System.out.println("user logged in successfully!\n");
                       // new MainMenu().run(loginUser);
                    }else {
                        System.out.println("Username and password didn’t match!\n");
                    }
                }else {
                    System.out.println("There is not any user with username: <username>!\n");
                }
            }else if (signupPattern.matcher(userCommand).matches()){
                Matcher matcher = signupPattern.matcher(userCommand);
                String username = null;
                String password = null;
                String passwordValidation = null;
                String email = null;
                while (matcher.find()) {
                    username = matcher.group(1);
                    password = matcher.group(2);
                    passwordValidation = matcher.group(3);
                    email = matcher.group(4);
                }
                if(!password.equals(passwordValidation)){
                    System.out.println("Your passwords are not the same!\n");
                }else if(existUser(username)){
                    System.out.println("user with username <username> already exists!\n");
                }else if (existEmail(email)) {
                    System.out.println("User with this email already exists!\n");
                } else if(!isValidEmail(email)) {
                    System.out.println("Email address is invalid!\n");
                }else {
                    User user = new User(username , password , email );
                    user.setUsername(username);
                    user.setPassword(password);
                    user.setEmail(email);
                    users.add(user);
                    System.out.println("user created successfully!\n");
                  //  new MainMenu().run(user);
                }
            }else {
                System.out.println("enter valid command");
            }
        }
    }
     public boolean existEmail(String email){
         for (User user : users) {
             if(user.getEmail().equals(email))
                 return true;
         }
         return false;
     }

    public boolean isValidEmail(String email){
        if(email == null || email.isEmpty()){
            return false;
        }
        String emailRegex = "^[a-zA-Z0-9.]+@(gmail||yahoo).com$";
        Pattern pattern = Pattern.compile(emailRegex);
        if (pattern.matcher(email).matches()) {
            return true;
        } else {
            return false;
        }

    }

    public boolean existUser(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username))
                return true;
        }
        return false;
    }
}
