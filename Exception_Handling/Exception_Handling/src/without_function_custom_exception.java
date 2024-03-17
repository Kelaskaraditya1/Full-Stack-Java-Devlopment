import java.util.*;
class MyException extends Exception
{
    @Override
    public String toString() {
        return "Something went wrong";
    }

    @Override
    public String getMessage() {
        return "Enter a number greater than 9";
    }
//    public MyException(String message)
//    {
//        this.getMessage(message);
//    }

}
public class without_function_custom_exception
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt();
        if(a<9)
        {
            try {
                throw new MyException();
            }
            catch(MyException e)
            {
                e.getMessage();
                e.toString();
                e.printStackTrace();
            }
        }

    }
}
