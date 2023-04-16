package stu.fei.oop.ls2023.task2.subtask4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of integer list:");
        int length = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 1; i <= length; i++) {
            arrayList.add(i);
        }
        System.out.println("Choose K:");
        int k = scanner.nextInt();
        arrayList = (ArrayList<Integer>) arrayList.stream()
                .filter(integer -> integer % k != 0)
                .collect(Collectors.toList());
        System.out.println("The list contains:");
        arrayList.forEach(System.out::println);
    }
}
