package stu.fei.oop.ls2023.task1.subtask2;

import stu.fei.oop.ls2023.seminar3.task1.Student;
import stu.fei.oop.ls2023.seminar3.task2.MyArray;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;


public class Main {


    public static void main(String[] args) {
        MyArray students = new MyArray();
        students.fillArray();
        Arrays.sort(students.array, Comparator.comparing(Student::getFirstName));
        Arrays.stream(students.array).toList().forEach(System.out::println);


    }
}