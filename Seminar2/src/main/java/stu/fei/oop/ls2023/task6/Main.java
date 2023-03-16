package stu.fei.oop.ls2023.task6;



public class Main {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{6, 3}, {6, 21}};
        System.out.println((matrix[0][0] * matrix[1][1]) - (matrix[0][1] * matrix[1][0]));
    }
}
