package constructor;
import java.util.*;
  class hey{
    public String date;
    public String task;
    public String duration;                                                                                                                                                                                                                                                                                                                                                                                                                                  
    public hey(String date,String task,String duration){
    this.date=date;
    this.task=task;
    this.duration=duration;
    }
    public hey() {
    }
}
class todisplay{
    void display(hey h){
        System.out .println("________________Well come _________________\n\n");
        System.out.println("Date :"+h.date);
        System.out.println("Task :"+h.task);
        System.out.println("Duration :"+h.duration);
    }
}
public class today {
    public static void main(String args[]){
        Scanner inputs=new Scanner(System.in);
        System.out.println("enter the date in this format day//month//year");
        hey h=new hey();
        h.date=inputs.nextLine();
        System.out.println("Enter the action that you are performed for this time ");
        h.task=inputs.nextLine();
        System.out.println("Enter the duration or how long perform it ");
        h.duration=inputs.nextLine();
        hey y=new hey(h.date,h.task,h.duration);
        todisplay obj=new todisplay();
        obj.display(h);// pass the reference to access the instance of that class that has been instantaited.
        inputs.close();
    }
}
