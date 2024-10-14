package PillarsInjavaprogramming;
// abstract class is conseptual class that can not instantaiated object for it.
// but it can use create reference object that refers the sub class object.
// sub class can instantiated if abstract methods in abstract class is overriden.
abstract class animal{
    abstract void animethod();
    // Constructor declaration
    public animal(){
        System.out.println("abstract constructor is called ");
    }
    
    void conmethod(){
        System.out.println("concreate methods");
    }
}

class dog extends animal{
    void animethod() {
        System.out.print("hey i am  dog "); 
    }
}

public class abst {
    public static void main (String args[]){
        dog pets=new dog();
    }
}