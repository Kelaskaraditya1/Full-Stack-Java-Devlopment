import java.util.*;
public class Anonymous
{
    public double area(int height,int base)
    {
        System.out.println("1st area ");
        return 0.5*height*base;
    }
    public double perimeter(int height,int base)
    {
        System.out.println("1st perimeter");
        return (2*base+height);
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter base of triangle");
        int base=s.nextInt();
        System.out.println("Enter the height of the Triangle");
        int height=s.nextInt();
        Anonymous object = new Anonymous()
        {
            public double area(int base,int height)
            {
                System.out.println("2nd area");
                return 1.732*Math.pow(base,2);
            }
            public double perimeter(int base,int height)
            {
                System.out.println("2nd perimeter");
                return 1.14*Math.pow(base,3);
            }
        };
        object.area(base,height);
        object.perimeter(base,height);
    }
}
