
import java.util.*;
public class Static_Method {
    static int sum(int A[])
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
            sum=sum+A[i];
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[] = new int [200];
        System.out.println("Enter the number of elements");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
            A[i]=s.nextInt();
        System.out.println("The Sum of elements of array is:"+sum(A));
    }
}