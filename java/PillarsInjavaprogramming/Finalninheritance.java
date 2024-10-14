package PillarsInjavaprogramming;
/*final in methods it indcates the method can not override (prevent from over ride)
 we can not use abstract and final key word the same tim because the abstract method
 is incomplate so it needs concreate method to define it in sub class.
 the purpos of final key word in method it helps final can sometimes provide a
performance enhancement: The compiler is free to inline calls
to them because it "knows" they will not be overridden by a
subclass.
final class can not implement inheritance.
we can not inherite from final class.
**/
 class f{
}
class b extends f{

}
public class Finalninheritance {
    public static void main(String[] args) {
    }
}
