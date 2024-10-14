/* 
 Write an abstract class GeometryObject with
A. Two abstract methods abstract getArea() and abstract getPerimeter().
B. A circle class with radius as a field and Rectangle with length and width fields.
D. declare one non-parametrized and one parameterized constructors for both
classes.
E. Use setter and getter methods.
F. write implementation for getArea and getPerimeter methods for both classes.
G. write TestMain class to test your classes.
 */
package Labclass;
abstract class Geometry{
    final static double pi=3.14;
    abstract double getArea();
    abstract double Perimeter();
}
class circle extends Geometry{
    double radius;
    circle (){

    }
    double getArea(){
        return (pi*radius*radius);
    }
    double Perimeter(){
        
          return 2*pi*radius;
    }
    circle(double radius){
    this.radius=radius;
    }
}
class rectangle{
    double length,width;
    rectangle(){

    }
    rectangle(double length,double width){
    this.length=length;
    this.width=width;
    }
    double getArea(){
        return length*width;
    }
    double Perimeter(){
        
          return 2*(length+width);
    }
}
public class classWork {
    public static void main (String args[]){
      circle c=new circle(3);
      System.out.println("Area of the circle :"+c.getArea());
      System.out.println("Perimater of the circle :"+c.Perimeter());
      rectangle re=new rectangle(3,4);
      System.out.println("Area of the rectangle :"+re.getArea());
      System.out.println("Perimater of the rectangle :"+re.Perimeter());
    }
}
