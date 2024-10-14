package Classbject;

class Class1 {
    String name;
    String sex;
    int age;
    static int  two;

    // Method to modify the object passed as an argument
    void modify(Class1 c) {
        c.name = "Aster";
        c.sex = "Female";
        c.age = 25;
    }

    // Method to display the object's properties
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Age: " + age);
    }
}

public class pass {  
    public static void main(String args[]) {
        Class1 obj = new Class1(); // Creating an object of Class1
        obj.name = "John";
        obj.sex = "Male";
        obj.age = 30;
        Class1.two=5;

        System.out.println("Before modification:");
        obj.display(); // Displaying the object's properties before modification

        obj.modify(obj); // Passing the object to modify its properties

        System.out.println("\nAfter modification:");
        obj.display(); // Displaying the object's properties after modification
    }
}
