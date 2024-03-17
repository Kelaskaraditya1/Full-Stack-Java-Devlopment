import java.util.*;
public class Multiplication_Matrix {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int A[][] = new int [3][3];
        int B[][] = new int [3][3];
        int C[][] = new int[3][3];
        System.out.println("Enter the elements of the 1st Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                A[i][j]=s.nextInt();
        }
        System.out.println("Enter the elements of nd Matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                B[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            int sum=0;
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    sum=sum+(A[i][k]*B[k][j]);
                }
                C[i][j]=sum;
                sum=0;
            }
        }
        System.out.println("The Product of the Matrix is");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.println(C[i][j]+" ");
        }
    }
}


