package stu.fei.oop.ls2023.seminar3.task2;

import stu.fei.oop.ls2023.seminar3.task1.Student;
import stu.fei.oop.ls2023.seminar3.task3.util.KeyboardInput;

import java.util.Arrays;

public class Main {

    public static Student[] fillArray(Student[] array) {
        String[] firstNames = new String[] {"Adam", "Brad", "Michael", "Jack"};
        String[] surnames = new String[] {"Hill", "Pitt", "Jackson" , "Sparrow"};
        int[] ages = new int[] {23, 21, 20, 18};
        for (int i = 0; i < firstNames.length; i++) {
            array[i] = new Student(i, firstNames[i], surnames[i], ages[i]);
        }
        return array;
    }

    public static void main(String[] args) {
        Student[] students = fillArray(new Student[4]);
        System.out.println("Default Student array: ");
        Arrays.stream(students).toList().forEach(System.out::println);
        boolean isAscending = false;
        Student[] mergeSorted;
        Student[] quickSorted;

        String input = KeyboardInput.readString("Choose if array should be ascending or descending (ASC/DESC)");
        if (input.equals("ASC")) {
            isAscending = true;
        }
        String parameter = KeyboardInput.readString("Choose parameter for sorting (firstname/surname/age/id)");
        
    }
}
