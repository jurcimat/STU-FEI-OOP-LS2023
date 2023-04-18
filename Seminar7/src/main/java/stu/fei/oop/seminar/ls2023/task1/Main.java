package stu.fei.oop.seminar.ls2023.task1;

import javax.swing.*;
import java.awt.*;

public class Main {

    int width;
    int height;

    public Main(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setLayout(new BorderLayout());
        f.add("North", new JLabel("Priklad s polygonmi"));

        f.add("Center", new MyCanvas());

        f.setVisible(true);


    }
}