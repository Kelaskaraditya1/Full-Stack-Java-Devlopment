import java.sql.SQLOutput;
import java.util.*;
public class Factorial {
    static int factorial(int no)
    {
        if(no==0||no==1)
            return 1;
        else
            return no*factorial(no-1);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int product=1;
        System.out.println("Enter the number whose factorial is to be found");
        int number = s.nextInt();
        int factorial = factorial(number);
        for(int i=1;i<=number;i++)
        {
            product=product*i;
        }
        System.out.println("The Factorial of the number is:"+product);
        System.out.println("The Factorial from recursion is:"+factorial);
    }
}