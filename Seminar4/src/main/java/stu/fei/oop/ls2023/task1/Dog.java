package stu.fei.oop.ls2023.task1;

public class Dog extends Animal{

    public Dog() {
        this.numberLegs = 4;
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Hav-hav");
    }
}
