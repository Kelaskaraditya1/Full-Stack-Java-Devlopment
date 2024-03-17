import java.util.*;
public class Star_Pattern {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of rows to be printed");
        int no=s.nextInt();
        for(int i=0;i<no;i++)
        {
            for(int j=0;j<no-i;j++)
                System.out.print("*");
            System.out.println();
        }

    }
}