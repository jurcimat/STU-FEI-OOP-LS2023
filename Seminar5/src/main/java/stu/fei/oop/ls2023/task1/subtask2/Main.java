package stu.fei.oop.ls2023.task1.subtask2;

import stu.fei.oop.ls2023.seminar3.task1.Student;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


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
        Student[] students = new Student[4];
        Main.fillArray(students);
        Arrays.sort(students, Comparator.comparing(Student::getFirstName));
        Arrays.stream(students).toList().forEach(System.out::println);


    }
}