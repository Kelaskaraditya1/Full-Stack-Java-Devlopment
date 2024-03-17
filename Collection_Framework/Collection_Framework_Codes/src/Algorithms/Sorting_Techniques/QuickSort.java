package Algorithms.Sorting_Techniques;
import java.util.*;
public class QuickSort
{
//    public static int partition(int A[],int low,int high)
//    {
//        int pivot=A[high],i=low-1;
//        for(int j=low;j<high;j++)
//        {
//            if(A[j]<pivot)
//            {
//                i++;
//                int tmp=A[j];
//                A[j]=A[i];
//                A[i]=tmp;
//            }
//        }
//        i++;
//        int tmp=A[i];
//        A[i]=pivot;
//        A[high]=tmp;
//        return i;
//    }
//    public static void quickSort(int A[],int low,int high)
//    {
//        if(low<high) {
//            int pivot = partition(A, low, high);
//            quickSort(A, low, pivot - 1);
//            quickSort(A, pivot + 1, high);
//        }
//    }
    public static int partition(int A[],int low,int high)
    {
        int i=low-1,pivot=A[high];
        for(int j=low;j<high;j++)
        {
            if(A[j]<pivot)
            {
                int tmp=A[++i];
                A[i]=A[low];
                A[low]=tmp;
            }
        }
        int tmp=A[++i];
        A[i]=pivot;
        A[high]=tmp;
        return i;
    }
    public static void quickSort(int A[],int low,int high)
    {
        if(low<high)
        {
            int pivot_index=partition(A,low,high);
            quickSort(A,low,pivot_index-1);
            quickSort(A,pivot_index+1,high);
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
        quickSort(A,0,no-1);
        for(int i=0;i<no;i++)
            System.out.print(A[i]+" ");
    }
}
