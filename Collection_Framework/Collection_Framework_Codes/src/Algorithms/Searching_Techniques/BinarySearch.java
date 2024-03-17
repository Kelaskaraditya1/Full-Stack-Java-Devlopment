package Algorithms.Searching_Techniques;
import java.util.*;
public class BinarySearch
{
    public static int binarySearch(int A[],int l,int h,int key)
    {
        while(l<=h)
        {
            int mid=(l+h)/2;
            if(A[mid]==key)
                return mid;
            else if(A[mid]>key)
                h=mid-1;
            else if(A[mid]<key)
                l=mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the no of elements");
        int no=s.nextInt();
        System.out.println("Enter the elements");
        int A[] = new int[200];
        for(int i=0;i<no;i++)
            A[i]=s.nextInt();
        System.out.println("Enter the Key");
        int key=s.nextInt();
                for(int i=0;i<no;i++)
        {
            for(int j=i+1;j<no;j++)
            {
                if(A[i]>A[j])
                {
                    int tmp=A[i];
                    A[i]=A[j];
                    A[j]=A[i];
                }
            }
        }
        int flag=binarySearch(A,0,no-1,key);
        if(flag!=-1)
            System.out.println("Key is present at "+key+" location");
        else
            System.out.println("Key is Absent");
    }
}
