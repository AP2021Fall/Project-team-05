package view.Menus;

public enum Menus {
    Main("Main menu"),
    Profile("Profile Menu"),
    NotificationBar("Notification Bar"),
    TasksPage("Task Page"),
    Team("Team Menu"),
    Calender("Calender Menu");

    public final String toBePrintedName;

    Menus(String name) {
        this.toBePrintedName = name;
    }
}
