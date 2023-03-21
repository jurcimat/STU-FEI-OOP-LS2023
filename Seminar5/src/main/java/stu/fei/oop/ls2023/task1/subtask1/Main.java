package stu.fei.oop.ls2023.task1.subtask1;

import java.util.ArrayList;

public class    Main {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Jozo");
        array.add("Jano");
        array.add("Miso");
        array.add("Fero");
        array.add("Dezi");
        array.forEach(n -> System.out.println(n));

    }
}