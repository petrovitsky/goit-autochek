package main;

import java.util.Arrays;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solve(1, -2, -3)));
        System.out.println(Arrays.toString(solve(1, 12, 36)));
        System.out.println(Arrays.toString(solve(5, 3, 7)));
    }
    public static double[] solve(int a, int b, int c){
        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            return new double[] {x2,x1};
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            return new double[]{x};
        }
        else {
            return new double[0];
        }
    }
}
