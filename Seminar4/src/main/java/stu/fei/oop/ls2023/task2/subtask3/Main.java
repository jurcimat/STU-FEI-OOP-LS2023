package stu.fei.oop.ls2023.task2.subtask3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> arrayList = new ArrayList<>();
        String input = "";
        while (!input.equals("exit")) {
            System.out.println("Enter a member of the list:");
            input = scanner.nextLine();
            arrayList.add(input);
        }
        arrayList.remove("exit");
        System.out.println("The list contains:");
        arrayList.forEach(System.out::println);
    }
}
