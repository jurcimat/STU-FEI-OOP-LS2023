package stu.fei.oop.ls2023.task2.subtask3;

import stu.fei.oop.ls2023.task2.subtask1.MyObject;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyObject o = new MyObject();
        o.add(new Random().nextInt(100));
        if (o.getI() > 50) {
            try {
                throw new GreaterThanFiftyException("Value was greater than 50.");
            } catch (GreaterThanFiftyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
