package model;

public enum Priority {
    Highest("Highest"),
    High("High"),
    Low("Low"),
    Lowest("Lowest");

    public final String toBePrintedName;

    Priority(String name) {
        this.toBePrintedName = name;
    }
}
