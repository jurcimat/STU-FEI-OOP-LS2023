package stu.fei.oop.ls2023.task2.subtask1;

import stu.fei.oop.ls2023.task1.Dog;

import java.util.ArrayList;

public class Main {


    public static void fillArray(ArrayList<Object> array) {
        array.add(2);
        array.add("Hello");
        array.add(new Dog());
    }

    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        fillArray(arrayList);
    }
}
