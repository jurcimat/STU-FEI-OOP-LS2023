package stu.fei.oop.seminar.ls2023.task2.subtask4.sierpinski;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int width = 600;
        int height = 600;
        JFrame frame = new JFrame("Sierpinski");
        MyCanvas canvas = new MyCanvas(width, height);
        frame.setSize(width + 15,height + 40);
        frame.add(canvas);
        frame.setVisible(true);
    }
}
