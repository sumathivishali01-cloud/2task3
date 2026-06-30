# 2task3
public interface Shape {

    double calculateArea();

    double calculatePerimeter();
}
public abstract class Polygon {

    public abstract int numberOfSides();
}
public class Circle implements Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Square extends Polygon implements Shape {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    public class Main111 {

    public static void main(String[] args) {

        Circle circle = new Circle(5);

        Square square = new Square(4);

        System.out.println("----- Circle -----");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimeter: " + circle.calculatePerimeter());

        System.out.println();

        System.out.println("----- Square -----");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimeter: " + square.calculatePerimeter());
        System.out.println("Number of Sides: " + square.numberOfSides());
    }
}

    @Override
    public int numberOfSides() {
        return 4;
    }
}
