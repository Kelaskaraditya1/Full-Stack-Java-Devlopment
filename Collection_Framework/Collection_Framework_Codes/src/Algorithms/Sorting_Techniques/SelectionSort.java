package Algorithms.Sorting_Techniques;

import java.util.*;
public class SelectionSort
{
    public static void bubbleSort(int A[],int no)
    {
        int last_index=no-1,max_element;
        while(last_index>0)
        {
            max_element=0;
            for(int i=0;i<last_index;i++)
            {
                if(A[i]>A[max_element])
                    max_element=i;
            }
            int tmp=A[last_index];
            A[last_index--]=A[max_element];
            A[max_element]=tmp;
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
        System.out.println("After sorting");
        for(int element:A)
            System.out.print(element+" ");

    }
}
