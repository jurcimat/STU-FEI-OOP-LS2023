package stu.fei.oop.ls2023.task2.subtask1;

public class MyObject {
    int i;

    public MyObject() {
        this.i = 0;
    }

    public MyObject(int i) {
        this.i = i;
    }
    public MyObject add(int i) {
        this.i += i;
        return this;
    }

    public int getI() {
        return this.i;
    }
}
