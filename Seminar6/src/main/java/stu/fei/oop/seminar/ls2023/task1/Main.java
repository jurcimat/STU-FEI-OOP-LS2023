package stu.fei.oop.seminar.ls2023.task1;

public class Main {
    public static void main(String[] args) {
        for (Colors color : Colors.values()) {
            System.out.printf("Is %s black? -> %s%n",color, color.isBlack());
        }
    }
}