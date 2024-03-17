import java.util.*;
public class Exception_Example_one
{
    public static boolean flag;
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        // Simple Try Catch Exception Handling


//        try {
//            int marks[] = {10, 20, 30};
//            System.out.println("Enter the Index");
//            int index = s.nextInt();
//            System.out.println("Enter the value through which value is to be divided");
//            int value = s.nextInt();
//            System.out.println("The value obtained after dividing is: " + marks[index] / value);
//
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println("The Operation is Sucessfull");

        // combination of try catch


//        try{
//            int marks[] = {10, 20, 30};
//            System.out.println("Enter the Index");
//            int index = s.nextInt();
//            System.out.println("Enter the value through which value is to be divided");
//            int value = s.nextInt();
//            System.out.println("The value obtained after dividing is: " + marks[index] / value);
//        }
//        catch(ArithmeticException e)
//        {
//            e.printStackTrace();
//        }
//        catch (ArrayIndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//        }


        // Nested Try Catch Block
//        int marks[] = {10,20,30,40,50,60,70,80,90,100};
//        try
//        {
//            System.out.println("Enter the index whose value is to be fetched from the array");
//            int index = s.nextInt();
//            try {
//                System.out.println("The Value present at the index is:"+marks[index]);
//            }
//            catch (ArrayIndexOutOfBoundsException e)
//            {
//                System.out.println("We are at Level 2");
//                e.printStackTrace();
//            }
//            try {
//                System.out.println("Enter the value through which the number is to be divided");
//                int value = s.nextInt();
//                int c = marks[index]/value;
//                System.out.println("The Value after Dividing is:"+c);
//            }
//            catch (ArithmeticException e)
//            {
//                System.out.println("We are at Level 3");
//                e.printStackTrace();
//            }
//
//        }
//        catch(Exception e)
//        {
//            System.out.println("We are at Level 1");
//            e.printStackTrace();
//        }
//        System.out.println("Operation Completed Sucessfully");


        // Exception example.
        int marks[] = {10,20,30,40,50,60,70,80,90,100};
        flag=true;
        while(flag)
        {
            try
            {
                System.out.println("Enter the index");
                int index=s.nextInt();
                try
                {
                    System.out.println("The value of marks at index is:"+marks[index]);
                    try {
                        System.out.println("Enter the value bby which it has to be divided");
                        int value = s.nextInt();
                        System.out.println("The value is:"+marks[index]/value);
                        flag=false;

                    }
                    catch (ArithmeticException e)
                    {
                        e.printStackTrace();
                    }
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                    e.printStackTrace();
                }

            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        System.out.println("Operation Completed Sucessfully");
    }
}
