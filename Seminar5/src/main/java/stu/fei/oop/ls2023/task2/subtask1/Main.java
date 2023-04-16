package stu.fei.oop.ls2023.task2.subtask1;

public class Main {
    public static void main(String[] args) {
        MyObject o = null;
        try {
            o.add(5);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown >:(");;
        }
    }
}