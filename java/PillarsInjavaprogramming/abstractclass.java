package PillarsInjavaprogramming;
abstract class Shape {
    // Abstract method to calculate area
   // We cannot declare abstract constructors or abstract static
// methods.
    abstract double calculateArea();
}
class Rectangle extends Shape {
    double length;
    double width;

    // Constructor
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return length * width;
    }
}

// Concrete subclass 2: Circle
class Circle extends Shape {
    double radius;

    // Constructor
    Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Concrete subclass 3: Triangle
class Triangle extends Shape {
    double base;
    double height;

    // Constructor
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implementing abstract method
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }
}

// Main class to test the program
public class abstractclass {
    public static void main(String[] args) {
        // Creating instances of concrete subclasses
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);
        Triangle triangle = new Triangle(6, 8);

        // Calculating and printing the areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}