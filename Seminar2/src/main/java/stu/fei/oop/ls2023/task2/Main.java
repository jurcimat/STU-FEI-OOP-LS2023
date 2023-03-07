package stu.fei.oop.ls2023.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int size = 8;
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        while (count != size) {
            array[count] = scanner.nextInt();
            count++;
        }
        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
