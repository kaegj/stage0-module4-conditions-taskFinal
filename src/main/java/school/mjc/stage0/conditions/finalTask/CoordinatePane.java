package school.mjc.stage0.conditions.finalTask;

import org.w3c.dom.ls.LSOutput;

public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        boolean xIsPositive = x > 0;
        boolean yIsPositive = y > 0;
        boolean xIsZero = x == 0;
        boolean yIsZero = y == 0;

        if (xIsZero || yIsZero) {
            System.out.println("zero");
        } else if (yIsPositive && xIsPositive) {
            System.out.println("first");
        } else if (yIsPositive && !xIsPositive) {
            System.out.println("second");
        } else if (!yIsPositive && !xIsPositive) {
            System.out.println("third");
        } else {
            System.out.println("fourth");
        }
    }
}
