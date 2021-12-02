package model;

public enum UserMode {
    TeamMember("Team Member"),
    TeamLeader("Team Leader"),
    SystemAdministrator("System Administrator");

    public final String toBePrintedName;

    UserMode(String name) {
        this.toBePrintedName = name;
    }
}
