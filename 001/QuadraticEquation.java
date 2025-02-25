/*
   A simple program to solve quadratic equations
 */

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, delta, x1, x2;
        char op1, op2;

        System.out.print("\na: ");
        a = sc.nextDouble();

        System.out.print("\nb: ");
        b = sc.nextDouble();

        System.out.print("\nc: ");
        c = sc.nextDouble();

        op1 = b>=0 ? '+': '\0';
        op2 = c>=0 ? '+': '\0';

        System.out.printf("\n\n\t%.0fX²%c%.0fX%c%.0f = 0\n\n", a, op1, b, op2, c);

        delta = Math.pow(b,2)-4*a*c;

        x1 = (-(b)+Math.sqrt(delta))/2*a;
        x2 = (-(b)-Math.sqrt(delta))/2*a;

        System.out.printf("\n\n\tΔ = %.0f", delta);
        System.out.printf("\n\tX¹ = %.0f", x1);
        System.out.printf("\n\tX² = %.0f\n\n", x2);

    }
}
