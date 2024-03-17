package Algorithms.Searching_Techniques;

import java.util.*;
public class Linear_Search
{
    public static boolean linearSearch(int A[],int no,int key)
    {
        for(int i=0;i<no;i++)
        {
            if(A[i]==key)
                return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        int A[] = new int[200];
        System.out.println("Enter the elements");
        for(int i=0;i<no;i++)
            A[i]=s.nextInt();
        System.out.println("Enter the key");
        int key=s.nextInt();
        boolean flag = linearSearch(A,no,key);
        if(flag)
            System.out.println("key is present");
        else
            System.out.println("Key is absent");
    }
}
