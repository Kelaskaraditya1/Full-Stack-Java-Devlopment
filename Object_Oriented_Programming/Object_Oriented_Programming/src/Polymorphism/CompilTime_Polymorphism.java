/*compile time polymorphism is achived using method overloading.
* conditions for mthod overloading
* 1) method with same name and in same class.
* 2)method argument should be different (either no of args, sequence or args)*
 */
package Polymorphism;
import java.util.*;
public class CompilTime_Polymorphism {
    public static Scanner s;
    //based on number of arguements.
    public static void sum()
    {
        s = new Scanner(System.in);
        System.out.println("Enter the 2 numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
    }
    public static void sum(int a)
    {
        s = new Scanner(System.in);
        System.out.println("Enter b");
        int b=s.nextInt();
        System.out.println("The Sum of "+a+" and "+b+" is "+(a+b));
    }
    public static void sum(int a,int b)
    {
        System.out.println("The Sum of "+a+" and "+b+" is "+(a+b));
    }
    // based on sequence and type of arguements
    public static void student_info(String name,int roll_no)
    {
        System.out.println("The Name of the Student is "+name);
        System.out.println("The Roll no of the Student is "+roll_no);
    }
    public static void student_info(int roll_no,String name)
    {
        System.out.println("The Name of the Student is "+name);
        System.out.println("The Roll no of the Student is "+roll_no);
    }

    public static void main(String[] args)
    {
        /* based on number of arguements
//        sum();
//        sum(10);
        sum(10,20);*/
        // based on type and seq of args
//        student_info("Aditya",54);
        student_info(56,"Mayur");

    }
}
