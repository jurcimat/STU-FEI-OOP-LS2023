package stu.fei.oop.seminar.ls2023.task1;

public enum Colors {
    BLACK(true),
    RED(false),
    ORANGE(false),
    GREEN(false);

    private final boolean isBlack;
    Colors(boolean isBlack) {
        this.isBlack = isBlack;
    }

    public boolean isBlack() {
        return isBlack;
    }
}
