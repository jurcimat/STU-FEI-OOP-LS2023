package stu.fei.oop.ls2023.task3.subtask8;

import stu.fei.oop.ls2023.task3.Dictionary;

public class Main {

    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Dictionary dictionary2 = dictionary;

        // Result is true because dictionary2 is reference to dictionary object, and they are the same object
        System.out.println(dictionary.equals(dictionary2)); // true

        /* Adding new key-value pair to dictionary2 does not affect result of equals method because they use
         the same reference */
        dictionary2.put("test", "test");
    }
}
