import java.util.*;
public class Input_Output {
    public String name;
    public int age;
    public char div;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        Input_Output obj = new Input_Output();
        System.out.println("Enter your Name");
        obj.name = s.next();
        System.out.println("Enter Your age");
        obj.age= s.nextInt();
        System.out.println("Enter your division");
        obj.div=s.next().charAt(0);
        System.out.println("Hey Brother!!");
        System.out.println("Your Name is "+obj.name);
        System.out.println("Your Age is "+obj.age);
        System.out.println("Your div is "+obj.div);
    }
}