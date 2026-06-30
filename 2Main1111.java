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