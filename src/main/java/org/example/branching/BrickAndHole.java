package org.example.branching;

/*
Hole dimensions A, B are given. And the dimensions x, y, z of the brick are also. Determine if a brick will fit in a hole.
 */

public class BrickAndHole {
    public static void main(String[] args) {
        Brick brick = new Brick(25, 26 , 26);
        Hole hole = new Hole(25, 25);
        WhetherToFit(brick, hole);
    }

    public static boolean WhetherToFit(Brick brick, Hole hole) {
        if ((brick.getX() == hole.getA()) && (brick.getZ() == hole.getB())) {
            System.out.println("Да, кирпичик подойдет");
            return true;
        } else {
            System.out.println("Кирпич не влазит");
            return false;
        }
    }

}

class Brick {
    private int x;
    private int y;
    private int z;

    public Brick(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
}

class Hole {
    private int A;
    private int B;

    public Hole(int A, int B) {
        this.A = A;
        this.B = B;
    }

    public int getA() {
        return A;
    }

    public int getB() {
        return B;
    }
}
