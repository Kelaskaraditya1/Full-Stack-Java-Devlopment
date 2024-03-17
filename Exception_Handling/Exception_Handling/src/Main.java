//Simple Try Catch Handling
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        try {
            System.out.println("Enter A");
            int a = s.nextInt();
            System.out.println("Enter B");
            int b = s.nextInt();
            System.out.println(a / b);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("I am B atman");
    }
}