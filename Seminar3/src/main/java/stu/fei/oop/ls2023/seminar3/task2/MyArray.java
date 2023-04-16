package stu.fei.oop.ls2023.seminar3.task2;

import stu.fei.oop.ls2023.seminar3.task1.Student;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyArray {

    public Student[] array;

    public MyArray() {
        array = new Student[4];
    }
    public Student[] fillArray() {
        String[] firstNames = new String[] {"Adam", "Brad", "Michael", "Jack"};
        String[] surnames = new String[] {"Hill", "Pitt", "Jackson" , "Sparrow"};
        int[] ages = new int[] {23, 21, 20, 18};
        for (int i = 0; i < firstNames.length; i++) {
            array[i] = new Student(i, firstNames[i], surnames[i], ages[i]);
        }
        return array;
    }

    public void shuffle() {
        List<Student> studentList = Arrays.asList(array);
        Collections.shuffle(studentList);
        studentList.toArray(array);
    }

    public void reverse() {
        List<Student> studentList = Arrays.asList(array);
        Collections.reverse(studentList);
        studentList.toArray(array);
    }
}
