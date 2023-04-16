package stu.fei.oop.ls2023.seminar3.task2;

import stu.fei.oop.ls2023.seminar3.task1.Student;
import stu.fei.oop.ls2023.seminar3.task3.util.KeyboardInput;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        MyArray students = new MyArray();
        students.fillArray();
        students.shuffle();
        System.out.println("Default Student array: ");
        Arrays.stream(students.array).toList().forEach(System.out::println);
        boolean isAscending = false;
        Student[] mergeSorted = students.array.clone();
        Student[] quickSorted = students.array.clone();

        String input = KeyboardInput.readString("Choose if array should be ascending or descending (ASC/DESC)");
        if (input.equals("ASC")) {
            isAscending = true;
        }
        String parameter = KeyboardInput.readString("Choose parameter for sorting (firstname/surname/age/id)");

        switch (parameter) {
            case "id":
                Arrays.sort(students.array, Comparator.comparing(Student::getId));
                break;
            case "firstname":
                Arrays.sort(students.array, Comparator.comparing(Student::getFirstName));
                break;
            case "surname":
                Arrays.sort(students.array, Comparator.comparing(Student::getSurname));
                break;
            case "age":
                Arrays.sort(students.array, Comparator.comparing(Student::getAge));
                break;
            default:
                System.out.println("Wrong parameter chosen");
                return;
        }
        if (!isAscending) {
            students.reverse();
        }

        System.out.println("Sorting via Arrays.sort()");
        Arrays.stream(students.array).toList().forEach(System.out::println);
        System.out.println("Sorting via merge sort");
        Sort.sort("merge sort", mergeSorted, parameter, isAscending);
        Arrays.stream(mergeSorted).toList().forEach(System.out::println);
        System.out.println("Sorting via quick sort");
        Sort.sort("quick sort", quickSorted, parameter, isAscending);
        Arrays.stream(quickSorted).toList().forEach(System.out::println);
    }
}
