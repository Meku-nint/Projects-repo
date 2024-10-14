package PillarsInjavaprogramming;
class Parent {
    Parent() {
        System.out.println("Parent constructor");
    }
    Parent(String ttt){
     System.err.println("this is parametrized parent constructor");
    }
// in java constructors not extend or inherit but when we create instance of subclass 
// the super or parent class consturctor is implicitly called before any constructor of subclass
    void display() {
        System.out.println("Parent's display method");
    }
}
class Child extends Parent {
    Child(){
        System.out.println("child class constructor");
    }
    Child(String ttt){
        super("heybelewma");// now the parent class defalut constructor is not called .
        System.out.println("child class parametrized constructor");
    }
    void display(){
        System.out.println("child method");
        super.display();

    }
} 

public class Main {
    public static void main(String[] args) {
        Child child=new Child();
        Child ch = new Child("hello");
        child.display();
    }
}
