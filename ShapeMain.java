
/*
Develop a Java program to create an abstract class named Shape that contains two 
integers and an empty method named printArea(). Provide three classes named Rectangle, 
Triangle and Circle such that each one of the classes extends the class Shape. Each 
one of the classes contain only the method printArea() that prints the area of the 
given shape.
*/
import java.util.Scanner;

abstract class Shape {
    double a, b;

    abstract void printArea();
}

class Rectangle extends Shape {
    void getData(double x, double y) {
        a = x;
        b = y;
    }

    void printArea() {
        System.out.println("Area of rectangle: " + (a * b));
    }
}

class Triangle extends Shape {
    void getData(double x, double y) {
        a = x;
        b = y;
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of triangle: " + area);
    }
}

class Circle extends Shape {
    void getData(double x) {
        a = x;
    }

    void printArea() {
        double area = 3.14 * a * a;
        System.out.println("Area of circle: " + area);
    }
}

public class ShapeMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ch;
        Rectangle r = new Rectangle();
        Triangle t = new Triangle();
        Circle c = new Circle();
        System.out.println("\n1.Rectangle\n2.Triangle\n3.Circle\n4.Exit");
        ch = in.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter length and breadth");
                double l = in.nextDouble();
                double b = in.nextDouble();
                r.getData(l, b);
                r.printArea();
                break;
            case 2:

        }

    }
}
