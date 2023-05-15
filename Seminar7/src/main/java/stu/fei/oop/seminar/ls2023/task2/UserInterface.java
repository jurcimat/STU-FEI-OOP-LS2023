package stu.fei.oop.seminar.ls2023.task2;

import javax.swing.*;
import java.awt.*;

public class UserInterface {

    public UserInterface() {
        JFrame f = new JFrame();
        f.setSize(300,300);
        f.setLayout(new BorderLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        JButton buttonClose = new JButton("Close");
        JButton buttonDraw = new JButton("Draw");
        JButton buttonClick = new JButton("Click");

        //buttonClose.addActionListener(panel);

        MyCanvas myCanvas = new MyCanvas();
        f.add("Center", myCanvas);

        f.setVisible(true);
    }
}
