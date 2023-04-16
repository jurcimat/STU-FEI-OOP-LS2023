package stu.fei.oop.ls2023.task2.subtask2;

import stu.fei.oop.ls2023.task2.subtask1.MyObject;

public class Main {
    public static void main(String[] args) {
        MyObject o = null;
        try {
            o.add(5);
        } catch (NullPointerException e) {
            System.out.println("Exception thrown >:(");;
            o = new MyObject();
            o.add(5);
        }
        System.out.println("Object was initialized and value was added.");
        System.out.println("o.i = " + o.getI());
    }
}
