package org.example;

public class Main {
    public static int compareTwoNumbers(int first, int second) {
        if (first > second) {
            return 1;
        } else if ( first == second) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(compareTwoNumbers(2,3));
    }
}