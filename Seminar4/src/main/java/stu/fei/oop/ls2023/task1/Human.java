package stu.fei.oop.ls2023.task1;

public class Human extends Animal{
    public Human() {
        this.numberLegs = 2;
    }

    @Override
    void sound() {
        System.out.println("Hello!");
    }
}
