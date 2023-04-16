package stu.fei.oop.ls2023.task2.subtask2;

import stu.fei.oop.ls2023.task1.Dog;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>(new ArrayList<>(List.of(2, "Hello", new Dog())));
        for (Object o : arrayList) {
            System.out.println(o);
            try {
                ((Dog) o).sound();
            } catch (Exception e) {
                System.out.println("This object does not have a sound method.");
            }
        }
    }
}
