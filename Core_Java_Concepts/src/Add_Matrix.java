import java.util.*;
public class Add_Matrix {
    public static void main(String[] args)
    {
        int A [][] = new int[3][3];
        int B [][] = new int [3][3];
        int C[][] = new int[3][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the elements of 1st matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                A[i][j]=s.nextInt();
        }
        System.out.println("Enter the elements of 2nd matrix");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                B[i][j]=s.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                C[i][j]=A[i][j]+B[i][j];
        }
        System.out.println("The Sum of Both the Matrix is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
                System.out.println(C[i][j]+" ");
        }
    }
}