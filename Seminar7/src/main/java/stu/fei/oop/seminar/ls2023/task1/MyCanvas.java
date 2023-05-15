package stu.fei.oop.seminar.ls2023.task1;

import java.awt.*;
import java.util.ArrayList;

public class MyCanvas extends Canvas {

    @Override
    public void paint(Graphics g) {
        Dimension d = getSize();
        int radius = 100;
        int stepAngle = 1;
        int step = stepAngle;
        double theta = 0;
        ArrayList<int[]> coords;
        Polygon polygon;
        g.setColor(Color.BLACK);

        while (true) {
            theta = step * (Math.PI / 180);
            coords = createPentagon(radius);
            coords = rotatePentagon(coords, theta);
            coords = translatePentagon(coords, d.width / 2, d.height / 2);
            polygon = new Polygon(coords.get(0), coords.get(1), 5);
            g.setColor(Color.BLACK);
            g.drawPolygon(polygon);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            g.setColor(Color.WHITE);
            g.drawPolygon(polygon);
            step += stepAngle;
            if (step > 360) {
                step = stepAngle;
            }
        }

    }

    private ArrayList<int[]> createPentagon(int radius) {
        int [] xCoords = new int[5];
        int [] yCoords = new int[5];
        for (int i = 0; i < 5; i++) {
            xCoords[i] = (int) (radius * Math.cos(i * 2 * Math.PI / 5));
            yCoords[i] = (int) (radius * Math.sin(i * 2 * Math.PI / 5));
        }
        ArrayList<int[]> coords = new ArrayList<>();
        coords.add(xCoords);
        coords.add(yCoords);
        return coords;
    }

    private ArrayList<int[]> rotatePentagon(ArrayList<int[]> coords, double theta) {
        int[] rotatedXCoords = new int[5];
        int[] rotatedYCoords = new int[5];
        int[] xCoords = coords.get(0);
        int[] yCoords = coords.get(1);
        for (int i = 0; i < 5; i++) {
            rotatedXCoords[i] = (int) (xCoords[i] * Math.cos(theta) - yCoords[i] * Math.sin(theta));
            rotatedYCoords[i] = (int) (xCoords[i] * Math.sin(theta) + yCoords[i] * Math.cos(theta));
        }
        ArrayList<int[]> rotatedCoords = new ArrayList<>();
        rotatedCoords.add(rotatedXCoords);
        rotatedCoords.add(rotatedYCoords);
        return rotatedCoords;
    }

    private ArrayList<int[]> translatePentagon(ArrayList<int[]> coords, int x, int y) {
        int[] translatedXCoords = new int[5];
        int[] translatedYCoords = new int[5];
        int[] xCoords = coords.get(0);
        int[] yCoords = coords.get(1);
        for (int i = 0; i < 5; i++) {
            translatedXCoords[i] = xCoords[i] + x;
            translatedYCoords[i] = yCoords[i] + y;
        }
        ArrayList<int[]> translatedCoords = new ArrayList<>();
        translatedCoords.add(translatedXCoords);
        translatedCoords.add(translatedYCoords);
        return translatedCoords;
    }
}
