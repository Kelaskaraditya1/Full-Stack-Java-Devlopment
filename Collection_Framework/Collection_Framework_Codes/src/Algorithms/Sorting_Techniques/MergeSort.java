package Algorithms.Sorting_Techniques;
import java.util.*;
public class MergeSort
{
    public static void merge(int A[],int low,int mid,int high)
    {
        int B[] = new int[high+1];
     int i=low,j=mid+1,k=0;
     while(i<=mid&&j<=high)
     {
         if(A[i]<A[j])
             B[k++]=A[i];
         else
             B[k++]=A[j++];
     }
     while(i<=mid)
         B[k++]=A[i++];
     while (j<=high)
         B[k++]=A[j++];
     for(int si=0,l=low;si<=high;si++,l++)
         A[si]=B[l];
    }
    public static void mergeSort(int A[],int low,int high)
    {
        if(low<high)
        {
            int mid=(low+high)/2;
            mergeSort(A,low,mid);
            mergeSort(A,mid+1,high);
            merge(A,low,mid,high);
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
        mergeSort(A,0,no-1);
        for(int i=0;i<no;i++)
            System.out.println(A[i]+" ");
    }
}
