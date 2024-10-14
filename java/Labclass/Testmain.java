/*2) A. write a shape class with a color field. define a constructor and getter and
setter methods.
B. write a circle class as a subclass of shape with radius as a field. use setter and
getter methods.
define default constructor, constructor to accept radius as a parameter and
a constructor to accept radius and color as parameters.
C. write a rectangle class as a subclass of shape with width and length as fields.
use setter and getter methods.
define default constructor, constructor to accept length and width as parameters
and
constructor to accept length and width and color as parameters.
D. write a square class as a subclass of rectangle.
use setter and getter methods.
define default constructor, constructor to accept a side as a parameter and
constructor to accept side and color as parameters.
E. write TestMain class
package Labclass;*/
package Labclass;
class Shape {
    String color;
    public Shape() {
    }
    public Shape(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
class Circle extends Shape {
    double radius;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color) {
        super(color);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}

class Square extends Rectangle {

    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color) {
        super(side, side, color);
    }
}

public class Testmain {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0, "Red");
        System.out.println("Circle Radius: " + circle1.getRadius());
        System.out.println("Circle Color: " + circle1.getColor());

        Rectangle rectangle1 = new Rectangle(4.0, 6.0, "Blue");
        System.out.println("Rectangle Width: " + rectangle1.getWidth());
        System.out.println("Rectangle Length: " + rectangle1.getLength());
        System.out.println("Rectangle Color: " + rectangle1.getColor());

        Square square1 = new Square(3.0, "Green");
        System.out.println("Square Side: " + square1.getWidth());
        System.out.println("Square Color: " + square1.getColor());
    }}