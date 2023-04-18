package stu.fei.oop.seminar.ls2023.task2.subtask4.sierpinski;

import java.awt.*;

public class MyCanvas extends Canvas {

    private int width;
    private int height;

    public MyCanvas() {
        setSize(500, 500);
    }

    public MyCanvas(int width, int height) {
        this.width = width;
        this.height = height;
        setSize(width, height);
    }

    private void drawSierpinski(int x, int y, int width, int height, int depth) {
        if (depth <= 0) {
            return;
        }
        System.out.println(depth);
        Graphics g = this.getGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(x + width / 3, y + height / 3, width / 3, height / 3);
        drawSierpinski(x, y, width / 3, height / 3, depth - 1);
        drawSierpinski(x + width / 3, y, width / 3, height / 3, depth - 1);
        drawSierpinski(x + 2 * width / 3, y, width / 3, height / 3, depth - 1);

        drawSierpinski(x, y + height / 3, width / 3, height / 3, depth - 1);
        drawSierpinski(x + 2 * width / 3, y + height / 3, width / 3, height / 3, depth - 1);

        drawSierpinski(x, y + 2 * height / 3, width / 3, height / 3, depth - 1);
        drawSierpinski(x + width / 3, y + 2 * height / 3, width / 3, height / 3, depth - 1);
        drawSierpinski(x + 2 * width / 3, y + 2 * height / 3, width / 3, height / 3, depth - 1);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.fillRect(0, 0, this.width, this.height);
        drawSierpinski(0, 0, this.width, this.height, 4);
    }

}
