package stu.fei.oop.seminar.ls2023.task1;

import java.awt.*;

public class MyCanvas extends Canvas {

    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        Polygon polygon = new Polygon(new int[]{50, 50, 100}, new int[] {100, 80, 20},3);
        g.drawString("Hello World!", 50,50);
        polygon.translate(10, 10);
        g.setColor(Color.BLACK);
        g.drawPolygon(polygon);
    }
}
