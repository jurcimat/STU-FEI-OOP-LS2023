package stu.fei.oop.ls2023.seminar3.task2;

import stu.fei.oop.ls2023.seminar3.task1.Student;

import java.util.Comparator;

public class Sort {

    public static Student[] sort(String type, Student[] array, String parameter, boolean ascending) {
        switch (type) {
            case "merge sort":
                mergeSort(array, array.length, parameter);
                break;
            case "quick sort":
                quickSort(array, 0, array.length - 1, parameter);
                break;
        }

        if (!ascending) {
            array = reverse(array);
        }
        return array;
    }

    private static void quickSort(Student[] array, int begin, int end, String parameter) {
        if (begin < end) {
            int partitionIndex = partition(array, begin, end, parameter);

            quickSort(array, begin, partitionIndex - 1, parameter);
            quickSort(array, partitionIndex + 1, end, parameter);
        }
    }

    private static int partition(Student[] array, int begin, int end, String parameter) {
        Student pivot = array[end];
        int i = (begin - 1);

        for (int j = begin; j < end; j++) {
            if (pivot.isGreaterThan(parameter, array[j])) {
                i++;

                Student swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        Student swapTemp = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swapTemp;

        return i + 1;
    }

    private static void mergeSort(Student[] array, int length, String parameter) {
        if (length < 2) {
            return;
        }
        int middle = length / 2;
        Student[] left = new Student[middle];
        Student[] right = new Student[length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = array[i];
        }

        for (int i = middle; i < length; i++) {
            right[i - middle] = array[i];
        }

        mergeSort(left, middle, parameter);
        mergeSort(right, length - middle, parameter);

        merge(array, left, right, middle, length - middle, parameter);

    }

    private static void merge(Student[] array,
                              Student[] leftArray,
                              Student[] rightArray,
                              int left,
                              int right,
                              String parameter) {
        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {
            if (leftArray[i].isLessThan(parameter, rightArray[i])) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }

        while (i < left) {
            array[k++] = leftArray[i++];
        }

        while (j < right) {
            array[k++] = rightArray[j++];
        }

    }



    private static Student[] reverse(Student[] array) {
        Student[] reversed = new Student[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reversed[array.length - 1 - i] = array[i];
        }
        return reversed;
    }
}
