package Inheritance;

public class MultiLevel_Inheritance {
    public static void main(String[] args)
    {
        Equilateral_Triangle triangle = new Equilateral_Triangle(10,10,10,10);
        System.out.println("The Area of the Triangle is "+triangle.Equi_area(10));
        System.out.println("The Perimeter of the Triangle is "+triangle.equi_perimeter(10));
    }
}
class Polygon
{
    public int dimensions;
    public Polygon(int dimensions)
    {
        this.dimensions=dimensions;
    }
}
class Triangle extends Polygon
{
    public int height,base;
    public double area,perimeter;
    public Triangle(int dimension,int height,int base)
    {
        super(dimension);
        this.height=height;
        this.base=base;
    }
    public double triangle_area(int height,int base)
    {
        area=0.5*base*height;
        return area;
    }
    public double triangle_perimeter(int base,int height)
    {
        perimeter=(2*base+height);
        return perimeter;
    }
}
class Equilateral_Triangle extends Triangle
{
    public int side;
    public double area,perimeter;
    public Equilateral_Triangle(int dimension,int height,int base,int side)
    {
        super(dimension,height,base);
        this.side=side;
    }
    public double Equi_area(int side)
    {
        area=1.732*Math.pow(side,2);
        return area;
    }
    public double equi_perimeter(int side)
    {
        perimeter=1.299*side;
        return perimeter;
    }
}

