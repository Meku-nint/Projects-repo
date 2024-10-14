package ObjectClass;
import java.util.Scanner;
class fields {
String name ;
int age;
public fields(){

};
public fields(String name,int age){
this.name =name;
this.age =age;}
public void show()
{
    System.out.println("Name :"+name);
    System.out.println("age :"+age);

}
}

public class ObClass {
public static void main(String args[]){
    Scanner scan =new Scanner(System.in);
    fields n=new fields();
    fields third=new fields("aster ",12);
    System.out.print("Name :");
    n.name=scan.nextLine();
    System.out.print("Age :");
    n.age=scan.nextInt();
    fields f=new fields(n.name,n.age);
    n.show();
    third.show();
    scan.close();
}
}
// always when you use new the object is created new even if the name of the object is 
// similar and it can be accessable by its reference .
/*Class (Java): A blueprint or template that defines the structure and behavior
 of objects in Java.
Object (Java): An instance of a class that represents a specific occurrence and 
embodies the attributes and behaviors defined by the class.
Fields: say what a class is.
◼ Methods: say what a class does
 */