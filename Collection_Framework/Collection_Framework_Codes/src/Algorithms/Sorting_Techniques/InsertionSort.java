package Algorithms.Sorting_Techniques;
import java.util.*;
public class InsertionSort
{
    public static void insertionSort(int A[],int no)
    {
        for(int i=1;i<no;i++)
        {
            int tmp=A[i],j=i-1;
            while(A[j]>tmp&&j>-1)
            {
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=tmp;
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
////
//        for(int i=1;i<no;i++)
//        {
//            int tmp=A[i],j=i-1;
//            while(A[j]>tmp && j>=0)
//            {
//                A[j+1]=A[j];
//                j--;
//            }
//            A[j+1]=tmp;
//        }
        insertionSort(A,no);
        System.out.println("After sorting");
        for(int i=0;i<no;i++)
            System.out.print(A[i]+" ");
    }
}
