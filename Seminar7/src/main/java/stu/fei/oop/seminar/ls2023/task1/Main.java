package stu.fei.oop.seminar.ls2023.task1;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(500,500);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add("North", new JLabel("Priklad s polygonmi"));

        MyCanvas myCanvas = new MyCanvas();
        myCanvas.setBackground(Color.WHITE);
        f.add("Center", myCanvas);

        f.setVisible(true);


    }
}