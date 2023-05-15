package stu.fei.oop.seminar.ls2023.task2.subtask3;

import java.awt.*;

public class MyCanvas extends Canvas {
    public MyCanvas() {
        setSize(500, 500);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.RED);
        g.fillPolygon(new int[]{100, 400, 250}, new int[]{150, 150, 50}, 3);
        g.setColor(Color.MAGENTA);
        g.fillRect(100, 150, 300, 300);
        g.setColor(Color.BLUE);
        g.fillRect(150,200,80,80);
        g.fillRect(270,200,80,80);

    }

}
