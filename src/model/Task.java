package model;

import java.sql.Time;
import java.util.ArrayList;

public class Task {
    String taskId;
    String title;
    String description;
    String priority;
    Time DateAndTimeOfCreation;
    Time DateAndTimeOfDeadline;
    ArrayList<User> assignedUsers;
    ArrayList<String> comments = new ArrayList<>();
}
