package pkgabstract;

import java.util.Scanner;

class Shape {

    void calculateArea() {
        System.out.println("Area of Shape");
    }

    void calculatePerimeter() {
        System.out.println("Perimeter of Shape");
    }

}

class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    void calculateArea() {
        System.out.println("Circle Area is : " + Math.PI * Math.pow(r, 2));
    }

    void calculatePerimeter() {
        System.out.println("Circle Perometer is : " + 2 * Math.PI * r);
    }

}

class Triangle extends Shape {

    double base, height, s1, s2;

    Triangle(double base, double height, double s1, double s2) {
        this.base = base;
        this.height = height;
        this.s1 = s1;
        this.s2 = s2;
    }

    void calculateArea() {
        System.out.println("Triangle area is : " + 0.5 * base * height);
    }

    void calculatePerimeter() {
        System.out.println("Triangle Perimeter Is : " + (s1 + s2 + base));
    }

}

public class Problem_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius, base, height, s1, s2;

        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        System.out.print("Enter the base: ");
        base = input.nextDouble();

        System.out.print("Enter the height: ");
        height = input.nextDouble();

        System.out.print("Enter the s1: ");
        s1 = input.nextDouble();

        System.out.print("Enter the s2: ");
        s2 = input.nextDouble();

        Circle op = new Circle(radius);
        op.calculateArea();
        op.calculatePerimeter();

        Triangle op1 = new Triangle(base, height, s1, s2);
        op1.calculateArea();
        op1.calculatePerimeter();

    }

}
