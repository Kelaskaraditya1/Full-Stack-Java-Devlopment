
import java.util.*;
public class Varags_Parameter
{
    static int sum(int ...A)
    {
        int sum=0;
        for(int val:A)
            sum=sum+val;
        return sum;
    }
    public static void main(String[] args)
    {
        System.out.println(sum(10,20,30,40,50));
    }
}