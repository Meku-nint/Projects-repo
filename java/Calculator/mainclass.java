package Calculator;
import java.util.Scanner;
  class calculate {
    double adder(double x,double y){
        return x+y;
    }
    double sub(double x,double y){
        return x-y;
    }
}
class mainclass{
public static void main(String args[]){
    System.out.print("Enter the two numbers :");
    Scanner input=new Scanner(System.in);
    double x=input.nextDouble();
    double y=input.nextDouble();
    calculate cal=new calculate();
    System.out.print(("The sum is :")+cal.adder(x,y));
    System.out.print(("The difference is :")+cal.sub(x,y));
    input.close();
    String n=new String("wewer");

}}