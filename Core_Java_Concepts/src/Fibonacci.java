import java.util.*;
public class Fibonacci {
    static int fibonacci(int no)
    {
        if(no==1)
            return 0;
        else if(no==2)
            return 1;
        else
            return fibonacci(no-1)+fibonacci(no-2);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a=0,b=1,c,no;
        System.out.println("Enter the number of fibonacci terms o be printed");
        no=s.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=3;i<=no;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        System.out.println("Using Recursion");
        for(int i=1;i<=no;i++)
            System.out.print(fibonacci(i)+" ");
    }
}
