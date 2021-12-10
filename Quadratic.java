/*
Develop a Java program that prints all real solutions to the quadratic equation 
ax2+bx+c= 0. Read in a, b, c and use the quadratic formula. If the discriminate 
b2-4ac is negative, display a message stating that there are no real solutions.
*/

import java.util.Scanner;

class Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a, b, c values: ");
        System.out.println("Quadratic eqn: ax^2+bx+c=0");
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = b * b - (4 * a * c);
        if (d == 0) {
            double r = -b / (2 * a);
            System.out.println("Roots are: " + r + " and " + r);
            System.out.println("Roots are real and equal");
        } else if (d > 0) {
            double r1 = (-b + (Math.sqrt(d))) / (2 * a);
            double r2 = (-b - (Math.sqrt(d))) / (2 * a);
            System.out.println("Roots are: " + r1 + " and " + r2);
            System.out.println("Roots are real and distinct");
        } else {
            System.out.println("Roots are imaginary(no real solutions)");
        }
        in.close();
    }
}