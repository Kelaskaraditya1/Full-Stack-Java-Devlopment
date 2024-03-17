import java.util.*;
class My_Exception extends Exception
{
    @Override
    public String toString() {
        return "Enter Number which is greater than 15";
    }
    @Override
    public String getMessage() {
        return "Enter a number which is greater than 9";
    }
}
public class Exception_Example_two
{
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter a");
        int a=s.nextInt();
        if(a<15)
        {
            try
            {
                throw new My_Exception();
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
            }
        }
        if(a<9)
        {
            try
            {
                throw new My_Exception();
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
