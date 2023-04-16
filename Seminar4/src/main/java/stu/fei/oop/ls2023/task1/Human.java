package stu.fei.oop.ls2023.task1;

public class Human extends Animal{
    private String name;
    public Human() {
        this.numberLegs = 2;
    }

    public Human(String name) {
        super(name);
        this.numberLegs = 2;
    }

    @Override
    void sound() {
        System.out.println("Hello!");
    }
}
