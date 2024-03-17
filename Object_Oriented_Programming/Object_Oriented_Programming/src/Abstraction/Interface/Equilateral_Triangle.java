package Abstraction.Interface;
import java.util.*;
interface Polygon
{
    public void dimensions(int base,int height);
}
interface Triangle
{
 public double area(int base,int height);
 public int perimeter(int base,int height);
}
public class Equilateral_Triangle implements Polygon,Triangle
{
    public int side;
    @Override
    public void dimensions(int base, int height) {
        System.out.println("The Bse of the Equilateral Triangle is: "+base);
        System.out.println("The Height of the Equilateral Triangle is: "+height);
    }
    @Override
    public double area(int base, int height) {
        return 0.5*(base+height);
    }

    @Override
    public int perimeter(int base, int height) {
        return (2*base)+height;
    }
    public double equi_triangle_area(int side)
    {
        return (0.4331*Math.pow(side,2));
    }
    public Equilateral_Triangle(int side)
    {
        this.side=side;
    }
    public static void main(String[] args)
    {
     Scanner s = new Scanner(System.in);
        System.out.println("Enter the Side of the Triangle");
     int side=s.nextInt();
        System.out.println("Enter the Base of the Triangle");
        int base=s.nextInt();
        System.out.println("Enter the Height oof the Triangle");
        int height=s.nextInt();
     Equilateral_Triangle triangle = new Equilateral_Triangle(side);
     triangle.dimensions(base,height);
        System.out.println("The Perimeter of the Triangle is:"+triangle.perimeter(base,height));
        System.out.println("Enter the Side of the Equilateral Triangle");
        System.out.println("The Area of the Equilateral Triangle is: "+triangle.equi_triangle_area(side));
    }
}
