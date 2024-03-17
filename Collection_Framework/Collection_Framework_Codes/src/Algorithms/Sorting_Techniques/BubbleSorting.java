package Algorithms.Sorting_Techniques;
import java.util.*;
public class BubbleSorting
{
    public static void bubbleSort(int A[],int no)
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
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[] = new int[200];
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        System.out.println("Enter the elements");
        for(int i=0;i<no;i++)
            A[i]=s.nextInt();
        bubbleSort(A,no);
        System.out.println("After Sorting");
        for(int i=0;i<no;i++)
            System.out.print(A[i]+" ");
    }
}
