package stu.fei.oop.seminar.ls2023.task2.subtask2;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("MyCanvas");
        MyCanvas canvas = new MyCanvas();
        frame.setSize(500,500);
        frame.add(canvas);
        frame.setVisible(true);
    }
}