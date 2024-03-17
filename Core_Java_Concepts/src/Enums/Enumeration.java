package Enums;
enum Status
{
    Running,Failed,Pending,Success;
}
public class Enumeration
{
    public static void main(String[] args)
    {
        Status s1 = Status.Running;
        Status s2 = Status.Failed;
        Status s3 = Status.Pending;
        Status s4 = Status.Success;
        System.out.println(s1.ordinal()+" "+s1);
        System.out.println(s2.ordinal()+" "+s2);
        System.out.println(s3.ordinal()+" "+s3);
        System.out.println(s4.ordinal()+" "+s4);
        Status s = Status.Success;
        if(s==Status.Running)
            System.out.println("Running");
        else if(s==Status.Failed)
            System.out.println("Failed");
        else if(s==Status.Pending)
            System.out.println("Pending");
        else
            System.out.println("Sucess");
        switch (s)
        {
            case Running:
                System.out.println("Running");
                break;
                case Failed:
                    System.out.println("Failed");
                    break;
            case Pending:
                System.out.println("Pending");
                break;
            case Success:
                System.out.println("Success");
                break;
        }
    }
}
