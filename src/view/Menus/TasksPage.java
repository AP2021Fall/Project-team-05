package view.Menus;

import model.Priority;
import model.Task;
import model.User;

import java.sql.Time;

public class TasksPage extends Menu{

    public void changeTitle(Task task , String newTitle){}
    public void changeDescription(Task task , String newDescription){}
    public void changePriority(Task task , Priority newPriority){}
    public void changeDeadline(Task task , Time newTime){}
    public void removeUserFromAssignedUsers(Task task , User user){}
    public void addToAssignedUsers(Task task , User user){}

    @Override
    public void execute() { }
}
