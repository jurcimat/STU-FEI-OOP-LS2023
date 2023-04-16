package stu.fei.oop.ls2023.task5;

import java.util.Scanner;

public class Main {

    public static int[] scanLine(Scanner scanner, int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input mxn dimensions of matrix(>>m n)");
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            array[i] = scanLine(scanner, n);
        }

        for (int[] ints : array) {
            for (int j : ints) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
