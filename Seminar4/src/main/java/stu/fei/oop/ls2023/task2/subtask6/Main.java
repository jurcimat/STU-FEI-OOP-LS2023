package stu.fei.oop.ls2023.task2.subtask6;

import stu.fei.oop.ls2023.task1.Animal;
import stu.fei.oop.ls2023.task1.Dog;
import stu.fei.oop.ls2023.task1.Human;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        ArrayList<Animal> arrayList = new ArrayList<>();
        arrayList.add(new Dog("Rex"));
        arrayList.add(new Human("John"));
        arrayList.add(new Dog("Bobby"));
        arrayList.add(new Human("Jane"));
        ArrayList<Animal> comparatorList = (ArrayList<Animal>) arrayList.clone();

        arrayList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        comparatorList.sort(Comparator.comparing(Animal::getName));

        System.out.println("Sorted by comparable interface:");
        arrayList.forEach(Animal::printName);
        System.out.println("Sorted by comparator:");
        comparatorList.forEach(Animal::printName);

    }
}
