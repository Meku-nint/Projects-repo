// Java Program to demonstrate Explicitly assigned strings
package Geeks;
class Strings {
    public static void main(String[] args)
    {
        String name = "Sachin";
        name = name.concat(" Tendulkar");
        System.out.println(name);
        String s1="when the reference is refer the first string ";
        s1="when the reference s1 refer the second reference :";
        // now the first string is become unreferenced which means eligable for garbage collector.
System.out.print (s1);
    }
}
