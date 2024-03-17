import java.util.*;
class Negative_Radius_Exception extends Exception
{
    @Override
    public String toString() {
        return "Enter Positive Radius";
    }

    @Override
    public String getMessage() {
        return "Enter Positive Radius";
    }
}
class Division_Exception extends Exception
{
    @Override
    public String toString() {
        return "cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return "Enter Denominator greater than 0";
    }
}
public class Custom_Exception
{
    public static double division(int a,int b) throws Division_Exception
    {
        if(b==0)
        {
            throw new Division_Exception();
        }
        else
            return a/b;
    }
    public static double area(int r) throws Negative_Radius_Exception
    {
        if(r<0)
        {
            throw new Negative_Radius_Exception();
        }
        else
            return Math.PI*Math.pow(r,2);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a");
        int a=s.nextInt();
        System.out.println("Enter b");
        int b=s.nextInt();
        System.out.println("Enter the Radius of the Circle");
        int radius=s.nextInt();
        try {
            System.out.println("The Ratio of a and b is:"+division(a,b));
        }
        catch(Division_Exception e)
        {
            e.printStackTrace();
        }
        try
        {
            System.out.println("The Area of the Circle is:"+area(radius));
        }
        catch (Negative_Radius_Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("Operation Sucessfully Completed");
    }
}
