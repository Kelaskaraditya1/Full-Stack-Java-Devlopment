/*
Conditions :
1)name of the methods should be same.
2)methods should be in different classes one extending another ie inheitance.
3)should have same parameters. no of args,sequence of args, type of args.
*/
package Polymorphism;
import java.util.*;
public class Run_Time_Polymorphism
{
    public static Scanner s;
    public static void main(String[] args)
    {
        s=new Scanner(System.in);
        System.out.println("Enter the Base");
        int base=s.nextInt();
        System.out.println("Enter the Height");
        int height=s.nextInt();
        System.out.println("Enter the side1");
        int side1=s.nextInt();
        System.out.println("Enter the side2");
        int side2=s.nextInt();
        Triangle triangle = new Triangle(height,base,side1,side2);
        System.out.println("The Area of the Triangle is "+triangle.area(height,base));
        Polygon polygon = new Polygon(side1,side2);
        System.out.println("The area of the Polygon is "+polygon.area(side1,side2));
    }
}
class Polygon
{
    public  int side1,side2;
    public double area(int side1,int side2)
    {
        return (double) side1*side2;
    }
    public Polygon(int side1,int side2)
    {
        this.side1=side1;
        this.side2=side2;
    }
}
class Triangle extends Polygon
{
    public int height,base;
    public Triangle(int height,int base,int side1,int side2)
    {
        super(side1,side2);
        this.height=height;
        this.base=base;
    }
    public double area(int height,int base)
    {
        return 0.5*base*height;
    }
}


