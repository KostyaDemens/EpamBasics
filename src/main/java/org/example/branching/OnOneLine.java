package org.example.branching;

/*
Given three points with coordinates. Determine if they lie on the same line
 */

public class OnOneLine {
    public static void main(String[] args) {
        Point[] points = {
                new Point(1, 1),
                new Point(2, 1),
                new Point(1, 2),
        };

        System.out.println(isItOnTheSameLine(points));

    }

    public static boolean isItOnTheSameLine(Point[] points) {
        for (int i = 0; i < points.length; i++) {
            if ((points[1].getX() == points[0].getX()) || ((points[1].getY()) == points[0].getY())) {
                return false;
            }
            if (((points[2].getX() - points[0].getX()) / ((points[1].getX()) - (points[0].getX()))) == (((points[2].getY() - points[0].getY()) / ((points[1].getY()) - points[0].getY())))) {
                return true;
            }
        }
        return false;
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
