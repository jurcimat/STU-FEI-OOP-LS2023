package stu.fei.oop.ls2023.task4;

public class Main {

    public static void main(String[] args) {
        int temp;
        int[] array = new int[]{5, 4, 3, 2, 1};
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    sorted = false;
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + "");
        }
        System.out.println();
    }
}
