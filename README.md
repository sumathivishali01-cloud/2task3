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

    @Override
    public int numberOfSides() {
        return 4;
    }
}
