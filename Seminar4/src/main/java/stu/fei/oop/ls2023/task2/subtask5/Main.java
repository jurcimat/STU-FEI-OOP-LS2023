package stu.fei.oop.ls2023.task2.subtask5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
        int length = 10;
        for (int i = 0; i < length; i++) {
            ArrayList<Integer> innerArrayList = new ArrayList<>();
            for (int j = 0; j < length; j++) {
                innerArrayList.add(j);
            }
            arrayList.add(innerArrayList);
        }
        arrayList.forEach(System.out::println);
    }
}
