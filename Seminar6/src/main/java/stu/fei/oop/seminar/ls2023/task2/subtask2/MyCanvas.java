package stu.fei.oop.seminar.ls2023.task2.subtask2;

import java.awt.*;

public class MyCanvas extends Canvas {
    public MyCanvas() {
        setSize(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(0, 0, 500, 500);
    }

}
