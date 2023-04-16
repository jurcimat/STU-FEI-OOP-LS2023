package stu.fei.oop.ls2023.task1;

public abstract class Animal {
    protected int numberLegs;
    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printName() {
        System.out.println(name);
    }

    abstract void sound();
}
