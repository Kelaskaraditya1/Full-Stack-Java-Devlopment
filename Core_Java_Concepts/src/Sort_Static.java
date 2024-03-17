import java.util.*;
public class Sort_Static
{
    static void sort(int A[],int no)
    {
        for(int i=0;i<no;i++)
        {
            for(int j=i+1;j<no;j++)
            {
                if(A[i]>A[j])
                {
                    int tmp=A[i];
                    A[i]=A[j];
                    A[j]=tmp;
                }
            }
        }
//        return A;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[] = new int[200];
        System.out.println("Enter the number of elements");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
            A[i]=s.nextInt();
        sort(A,no);
        System.out.println("After Sorting the array");
        for(int i=0;i<no;i++)
            System.out.print(A[i]+" ");
    }
}

